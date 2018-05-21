package com.akce.wallet.service.account;

import com.akce.wallet.dto.AccountDTO;
import com.akce.wallet.projection.CustomerAccountsResponse;

import java.util.List;

/**
 * Created by Emre on 10.05.2018.
 */
public interface AccountService {
    void addAccount();

    void removeAccount(Long id);

    List<CustomerAccountsResponse> getAccountsByCustomerId(Long customerId);
}
