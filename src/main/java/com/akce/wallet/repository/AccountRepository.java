package com.akce.wallet.repository;

import com.akce.wallet.enity.Account;
import com.akce.wallet.projection.CustomerAccountsResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Emre on 10.05.2018.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("SELECT a.currency.name as name , sum(am.amount) as balance " +
            "from Account a join a.accountMovements am where a.customer.id =?1 group by a ")
    List<CustomerAccountsResponse> getAccountsByCustomerId(Long customerId);
}
