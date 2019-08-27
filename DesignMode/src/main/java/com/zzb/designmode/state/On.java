package com.zzb.designmode.state;

public class On implements State {
    @Override
    public void switchOn(Switcher switcher) {
        System.out.println("WARN !! the switch is on !!! ");
    }

    @Override
    public void switchOff(Switcher switcher) {
        switcher.setState(new Off());
        System.out.println("OK ! the switch is turn off !");
    }
}
