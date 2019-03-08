package com.zzb.learn.test;

import com.zzb.learn.adapter.IWorkerAdapter;
import com.zzb.learn.adapter.impl.CookerAdapter;
import com.zzb.learn.adapter.impl.ProgramerAdapter;
import com.zzb.learn.worker.ICooker;
import com.zzb.learn.worker.IProgrammer;
import com.zzb.learn.worker.impl.Cooker;
import com.zzb.learn.worker.impl.Programmer;

public class MyTest {

    public static void main(String[] args) {
        ICooker qjdCooker = new Cooker();
        IProgrammer jdProgrammer = new Programmer();
        Object[] workers = {qjdCooker, jdProgrammer};
        for (Object worker :
                workers) {
            getAdapter(worker).work(worker);
        }
    }

    public static IWorkerAdapter getAdapter(Object worker) {
        IWorkerAdapter[] iWorkerAdapters = {new ProgramerAdapter(), new CookerAdapter()};
        for (IWorkerAdapter workerAdapter :
                iWorkerAdapters) {
            if (workerAdapter.support(worker)) {
                return workerAdapter;
            }
        }
        return null;
    }
}
