package com.zzb.designmode.state2;

public interface State {
    void switchOpen(Switcher switcher);

    void switchClose(Switcher switcher);

    void switchStop(Switcher switcher);

    void switchRunning(Switcher switcher);
}
