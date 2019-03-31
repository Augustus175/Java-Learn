package com.zzb.learn.dao;

import com.zzb.learn.beans.Stock;

public interface IStockDao {
    void insertStock(String sname, double count);

    void updateStock(String sname, double count, boolean isBuy);

    Stock selectStock(String sname);
}
