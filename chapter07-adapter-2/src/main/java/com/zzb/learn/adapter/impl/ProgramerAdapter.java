package com.zzb.learn.adapter.impl;

import com.zzb.learn.adapter.IWorkerAdapter;
import com.zzb.learn.worker.ICooker;
import com.zzb.learn.worker.IProgrammer;

public class ProgramerAdapter implements IWorkerAdapter {
    @Override
    public void work(Object worker) {
        ((IProgrammer) worker).program();
    }

    @Override
    public boolean support(Object worker) {
        return (worker instanceof IProgrammer);
    }
}
