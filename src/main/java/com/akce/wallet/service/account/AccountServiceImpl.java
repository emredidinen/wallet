package com.akce.wallet.service.account;

import com.akce.wallet.projection.CustomerAccountsResponse;
import com.akce.wallet.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Emre on 10.05.2018.
 */
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void addAccount() {

    }

    @Override
    public void removeAccount(Long id) {

    }

    @Override
    public List<CustomerAccountsResponse> getAccountsByCustomerId(Long customerId) {

        return accountRepository.getAccountsByCustomerId(customerId);
    }
}
