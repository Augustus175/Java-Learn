package com.zzb.learn.dao;

import com.zzb.learn.beans.Account;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void insertAccount(String aname, double money) {
        String sql = " insert into account (aname, balance) values (?,?) ";
        this.getJdbcTemplate().update(sql, aname, money);
    }

    @Override
    public void updateAccount(String aname, double money, boolean isBuy) {
        String sql = " update account set balance = balance + ? where aname = ? ";
        if (isBuy) {
            sql = " update account set balance = balance - ? where aname = ? ";
        }
        this.getJdbcTemplate().update(sql, money, aname);
    }

    @Override
    public Account selectAccount(String aname) {
        String sql = "select id, aname, balance from account ";
//        return this.getJdbcTemplate().queryForObject(sql, new AccountMapper(), aname);
        return null;
    }
}
