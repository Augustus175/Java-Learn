package com.zzb.learn.test;

import com.zzb.learn.adapter.IWorkerAdapter;
import com.zzb.learn.adapter.impl.WorkerAdapter;
import com.zzb.learn.worker.ICooker;
import com.zzb.learn.worker.IProgrammer;
import com.zzb.learn.worker.impl.Cooker;
import com.zzb.learn.worker.impl.Programmer;

public class MyTest {

    public static void main(String[] args) {
        ICooker qjdCooker = new Cooker();
        IProgrammer jdProgrammer = new Programmer();
        Object[] workers = {qjdCooker, jdProgrammer};
        IWorkerAdapter workerAdapter = new WorkerAdapter();
        for (Object worker :
                workers) {
            workerAdapter.work(worker);
        }
    }
}
