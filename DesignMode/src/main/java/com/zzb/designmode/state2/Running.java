package com.zzb.designmode.state2;

public class Running implements State {
    @Override
    public void switchOpen(Switcher switcher) {
        System.out.println("WARN !!! The door of lift car don't allow to open  now !!");
    }

    @Override
    public void switchClose(Switcher switcher) {
        System.out.println("WARN !!! The door of  lift car was already closed !!");
    }

    @Override
    public void switchStop(Switcher switcher) {
        switcher.setState(new Stop());
        System.out.println("OK !!! The lift car was already stopped !!");
    }

    @Override
    public void switchRunning(Switcher switcher) {
        System.out.println("WARN !!! The lift car is running now !!");
    }
}
