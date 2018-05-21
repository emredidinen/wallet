package com.akce.wallet.base;

/**
 * Created by Emre on 10.05.2018.
 */
public enum Exceptions {

    DATA_NOT_FOUND("Kayıt bulunamadı"),
    DELETE_CHILD_RECORD("Silmek istenilen alan başka yerde kullanılıyor."),
    DEFAULT("Hata oluştu.");




    Exceptions(String type) {
        this.type = type;
    }

    private String type;

    public String getType() {
        return type;
    }
}
