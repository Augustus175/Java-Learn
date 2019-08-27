package com.zzb.designmode.state2;

public class Open implements State {
    @Override
    public void switchOpen(Switcher switcher) {
        System.out.println("WARN !!! The door of  lift car was already opened !!");
    }

    @Override
    public void switchClose(Switcher switcher) {
        switcher.setState(new Close());
        System.out.println("OK !!! The door of  lift car was already closed !!");
    }

    @Override
    public void switchStop(Switcher switcher) {
        System.out.println("WARN !!! The lift car was already stopped !!");
    }

    @Override
    public void switchRunning(Switcher switcher) {
        System.out.println("WARN !!! The lift car don't allow to run now !!");
    }
}
