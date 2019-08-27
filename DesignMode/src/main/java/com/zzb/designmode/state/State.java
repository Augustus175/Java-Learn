package com.zzb.designmode.state;

public interface State {
    void switchOn(Switcher switcher);

    void switchOff(Switcher switcher);
}
