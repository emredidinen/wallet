package com.akce.wallet.base;

import java.util.HashMap;

/**
 * Created by Emre on 10.05.2018.
 */
public enum ConstraintException {
    UK_ACCOUNT_CURRENCY_CUSTOMER("Tekrarlı Hesap Açamazsınız.");

    ConstraintException(String type) {
        this.type = type;
    }

    private String type;

    public String getType() {
        return type;
    }

    private static HashMap<String, String> excMap = new HashMap<>();

    public static String getExceptionDetail(String constraintName) {
        if (constraintName == null) {
            return "";
        }
        if (constraintName.split("\\.").length > 1) {
            constraintName = constraintName.split("\\.")[1];
        }

        if (excMap.isEmpty()) {
            for (ConstraintException constraintException : values()) {
                excMap.put(constraintException.toString(), constraintException.getType());
            }
        }
        return excMap.get(constraintName);
    }
}
