package com.zzb.learn.service;

import com.zzb.learn.beans.Account;
import com.zzb.learn.beans.Stock;

public interface IBuyStockService {
    void openAccount(String aname, double money);

    void openStock(String sname, double count);

    void buyStock(String aname, double money, String sname, double count);

    Account findAccount(String aname);

    Stock findStock(String sname);
}
