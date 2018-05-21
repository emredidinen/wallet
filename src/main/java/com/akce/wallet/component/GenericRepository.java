package com.akce.wallet.component;

import com.akce.wallet.base.ConstraintException;
import com.akce.wallet.base.CustomConstraintException;
import com.akce.wallet.base.CustomServiceException;
import com.akce.wallet.base.Exceptions;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Emre on 10.05.2018.
 */
@Component
@SuppressWarnings("unchecked")
public class GenericRepository<T> {
    public T saveUpdateDataToDb(T entity, Object request, JpaRepository repo) {
        String type = entity.getClass().toString();
        try {
            entity = (T) repo.save(entity);
            repo.flush();
        } catch (DataIntegrityViolationException ex) {
            String constraintName = ((ConstraintViolationException) ex.getCause()).getConstraintName();
            throw new CustomConstraintException(ConstraintException.getExceptionDetail(constraintName));
        } catch (Exception ex) {
            throw new CustomConstraintException(Exceptions.DEFAULT.getType());
        }
        return entity;
    }

    public Boolean removeEntity(Long id, JpaRepository repo) {
        String type = repo.getClass().toString();
        try {
            repo.delete(id);
            repo.flush();
            return true;
        } catch (EmptyResultDataAccessException ex) {
            throw new CustomServiceException(Exceptions.DATA_NOT_FOUND.getType());
        } catch (DataIntegrityViolationException exception) {
            throw new CustomServiceException(Exceptions.DELETE_CHILD_RECORD.getType());
        } catch (Exception exception) {
            throw new CustomServiceException(Exceptions.DEFAULT.getType());
        }
    }
}
