package com.zzb.designmode.state2;

public class Switcher {
    private State state = new Open();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switchStop() {
        this.state.switchStop(this);
    }

    public void switchClose() {
        this.state.switchClose(this);
    }

    public void switchRunning() {
        this.state.switchRunning(this);
    }

    public void switchOpen() {
        this.state.switchOpen(this);
    }
}
