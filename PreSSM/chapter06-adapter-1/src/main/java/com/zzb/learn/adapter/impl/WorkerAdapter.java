package com.zzb.learn.adapter.impl;

import com.zzb.learn.adapter.IWorkerAdapter;
import com.zzb.learn.worker.ICooker;
import com.zzb.learn.worker.IProgrammer;

public class WorkerAdapter implements IWorkerAdapter {
    @Override
    public void work(Object worker) {
        if (worker instanceof ICooker) {
            ((ICooker) worker).cook();
        } else if (worker instanceof IProgrammer) {
            ((IProgrammer) worker).program();
        }

    }
}
