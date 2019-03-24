package com.zzb.learn.service;


public class SomeServiceImpl implements ISomeService {


    @Override
    public String doSomething() {
        System.out.println("run doSomething!");
        return "abc";
    }

    @Override
    public boolean chckUser(String username, String password) throws UserException {
        if (!"Beijing".equals(username)) {
            throw new UserNameException("wrong username");
        }
        if (!"111".equals(password)) {
            throw new UserNameException("wrong password");
        }
        return true;
    }
}
