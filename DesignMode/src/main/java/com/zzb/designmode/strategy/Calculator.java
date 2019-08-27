package com.zzb.designmode.strategy;

public class Calculator {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int a, int b) {
        return this.strategy.calculate(a, b);
    }
}
