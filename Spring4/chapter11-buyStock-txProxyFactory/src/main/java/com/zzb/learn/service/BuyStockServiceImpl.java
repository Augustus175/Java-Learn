package com.zzb.learn.service;

import com.zzb.learn.beans.Account;
import com.zzb.learn.beans.Stock;
import com.zzb.learn.dao.IAccountDao;
import com.zzb.learn.dao.IStockDao;
import com.zzb.learn.exeception.BuyStockException;

public class BuyStockServiceImpl implements IBuyStockService {
    private IAccountDao accountDao;
    private IStockDao stockDao;

    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public IStockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(IStockDao stockDao) {
        this.stockDao = stockDao;
    }

    @Override
    public void openAccount(String aname, double money) {
        accountDao.insertAccount(aname, money);
    }

    @Override
    public void openStock(String sname, double count) {
        stockDao.insertStock(sname, count);
    }

    @Override
    public void buyStock(String aname, double money, String sname, double count) throws Exception {
        boolean isBuy = true;
        accountDao.updateAccount(aname, money, isBuy);
        if (1 == 1) {
            throw new BuyStockException("buy stock exception");
        }
        stockDao.updateStock(sname, count, isBuy);
    }

    @Override
    public Account findAccount(String aname) {
        return accountDao.selectAccount(aname);
    }

    @Override
    public Stock findStock(String sname) {
        return stockDao.selectStock(sname);
    }
}
