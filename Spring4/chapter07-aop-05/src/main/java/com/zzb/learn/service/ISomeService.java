package com.zzb.learn.service;


public interface ISomeService {
    String  doSomething();
    boolean chckUser(String username,String password) throws UserException;
}
