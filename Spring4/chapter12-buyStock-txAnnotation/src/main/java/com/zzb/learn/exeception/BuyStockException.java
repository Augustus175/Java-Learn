package com.zzb.learn.exeception;

public class BuyStockException extends Exception {
    public BuyStockException() {
    }

    public BuyStockException(String message) {
        super(message);
    }
}
