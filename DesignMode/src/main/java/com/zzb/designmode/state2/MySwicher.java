package com.zzb.designmode.state2;

public class MySwicher {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.switchOpen();
        switcher.switchRunning();
        switcher.switchStop();
        switcher.switchOpen();
        switcher.switchRunning();
        switcher.switchClose();
        switcher.switchRunning();
        switcher.switchOpen();
        switcher.switchRunning();

    }
}
