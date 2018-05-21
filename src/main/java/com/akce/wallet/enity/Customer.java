package com.akce.wallet.enity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by Emre on 10.05.2018.
 */
@Entity
@Getter
@Setter
public class Customer extends BaseEntity {
    private String userName;
    private String name;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Account> accounts;

    @LastModifiedDate
    protected Date updateDate;

}
