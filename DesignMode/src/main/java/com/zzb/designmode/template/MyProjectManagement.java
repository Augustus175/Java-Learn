package com.zzb.designmode.template;

public class MyProjectManagement extends ProjectManagement {

    @Override
    public void beforeProject() {
        System.out.println("Prepares human resource !");
    }

    @Override
    public void analyze() {
        System.out.println("Do analyze !");
    }

    @Override
    public void design() {
        System.out.println("Do design !");
    }

    @Override
    public void develop() {
        System.out.println("Do develop !");
    }

    @Override
    public boolean test() {
        System.out.println("Do project test !");
        return true;
    }

    @Override
    public void release() {
        System.out.println("Do project release !");
    }

    public static void main(String[] args) {
        MyProjectManagement myProjectManagement = new MyProjectManagement();
        myProjectManagement.setBeforeFlag(true);
        myProjectManagement.kickOff();
    }
}

