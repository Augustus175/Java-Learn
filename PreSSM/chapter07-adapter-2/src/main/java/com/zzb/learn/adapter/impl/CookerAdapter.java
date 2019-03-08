package com.zzb.learn.adapter.impl;

import com.zzb.learn.adapter.IWorkerAdapter;
import com.zzb.learn.worker.ICooker;

public class CookerAdapter implements IWorkerAdapter {
    @Override
    public void work(Object worker) {
        ((ICooker) worker).cook();
    }

    @Override
    public boolean support(Object worker) {
        return (worker instanceof ICooker);
    }
}
