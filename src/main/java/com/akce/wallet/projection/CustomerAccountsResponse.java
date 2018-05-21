package com.akce.wallet.projection;

import java.math.BigDecimal;

/**
 * Created by Emre on 10.05.2018.
 */
public interface CustomerAccountsResponse {
    String getName();
    BigDecimal getBalance();
}
