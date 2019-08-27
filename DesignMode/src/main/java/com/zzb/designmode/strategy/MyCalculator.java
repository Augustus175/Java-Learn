package com.zzb.designmode.strategy;

public class MyCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("============add==========");
        Addition addition = new Addition();
        calculator.setStrategy(addition);
        int result = calculator.getResult(1, 3);
        System.out.println(result);
        System.out.println("============sub==========");
        Subtraction subtraction = new Subtraction();
        calculator.setStrategy(subtraction);
        result = calculator.getResult(1, 3);
        System.out.println(result);
    }
}
