package com.akce.wallet.enity;

import com.akce.wallet.base.UniqueConstraintConfig;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Emre on 10.05.2018.
 */

@Entity
@Getter
@Setter
@Table(name = "ACCOUNT", uniqueConstraints = {@UniqueConstraint(columnNames = {"currency_id", "customer_id"}, name = UniqueConstraintConfig.UK_ACCOUNT_CURRENCY_CUSTOMER)})
public class Account extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Currency currency;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<AccountMovement> accountMovements;
}
