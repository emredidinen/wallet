package com.akce.wallet.enity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

/**
 * Created by Emre on 10.05.2018.
 */
@Entity
@Getter
@Setter
public class AccountMovement extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;

    @Column(columnDefinition = "DECIMAL(19,8)")
    private BigDecimal amount;
}
