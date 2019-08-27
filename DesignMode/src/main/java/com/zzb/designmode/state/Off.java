package com.zzb.designmode.state;

public class Off implements State {
    @Override
    public void switchOn(Switcher switcher) {
        switcher.setState(new On());
        System.out.println("OK ! the switch is turn on");
    }

    @Override
    public void switchOff(Switcher switcher) {
        System.out.println("WARN !! the switch is off !!! ");
    }
}
