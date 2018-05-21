package com.akce.wallet.enity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by Emre on 10.05.2018.
 */
@Entity
@Getter
@Setter
public class Currency extends BaseEntity {
    private String name;
}
