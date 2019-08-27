package com.zzb.designmode.state;

public class MyState {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.setState(new Off());
        switcher.switchOff();
        switcher.switchOff();
        switcher.switchOn();
        switcher.switchOn();
    }
}
