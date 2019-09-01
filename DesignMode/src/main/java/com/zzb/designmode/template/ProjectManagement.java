package com.zzb.designmode.template;

public abstract class ProjectManagement {
    private boolean beforeFlag;

    public void beforeProject() {

    }

    protected abstract void analyze();

    protected abstract void design();

    protected abstract void develop();

    protected abstract boolean test();

    protected abstract void release();

    public final void kickOff() {
        if (this.beforeFlag) {
            beforeProject();
        }
        analyze();
        design();
        develop();
        while (!test()) {
            develop();
        }
        release();
    }

    public boolean getBeforeFlag() {
        return beforeFlag;
    }

    public void setBeforeFlag(boolean beforeFlag) {
        this.beforeFlag = beforeFlag;
    }
}
