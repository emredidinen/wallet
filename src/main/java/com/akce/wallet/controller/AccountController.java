package com.akce.wallet.controller;

import com.akce.wallet.service.account.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Emre on 10.05.2018.
 */
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/account/getByCustomerId/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getByCustomerId(@PathVariable Long id) {
        return ResponseEntity.ok(accountService.getAccountsByCustomerId(id));
    }
}
