package com.akce.wallet.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Emre on 10.05.2018.
 */
@Data
public class AccountDTO {
    private Long id;
    private CurrencyDTO currencyDTO;
    private CustomerDTO customerDTO;
    private BigDecimal balance;

}
