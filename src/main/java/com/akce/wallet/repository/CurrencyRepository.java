package com.akce.wallet.repository;

import com.akce.wallet.enity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Emre on 10.05.2018.
 */
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
