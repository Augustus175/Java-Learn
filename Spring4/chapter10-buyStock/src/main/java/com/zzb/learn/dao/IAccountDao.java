package com.zzb.learn.dao;

import com.zzb.learn.beans.Account;

public interface IAccountDao {
    void insertAccount(String aname, double money);

    void updateAccount(String aname, double money, boolean isBuy);

    Account selectAccount(String aname);
}
