package com.zzb.designmode.state;

public class Switcher {
    private State state = new Off();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switchOn() {
        this.state.switchOn(this);
    }

    public void switchOff() {
        this.state.switchOff(this);
    }
}
