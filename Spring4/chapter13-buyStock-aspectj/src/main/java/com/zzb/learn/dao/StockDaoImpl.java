package com.zzb.learn.dao;

import com.zzb.learn.beans.Stock;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StockDaoImpl extends JdbcDaoSupport implements IStockDao {
    @Override
    public void insertStock(String sname, double count) {
        String sql = " insert into stock (sname, count) values (?,?) ";
        this.getJdbcTemplate().update(sql, sname, count);
    }

    @Override
    public void updateStock(String sname, double count, boolean isBuy) {
        String sql = " update stock set count = count - ? where sname = ? ";
        if (isBuy) {
            sql = " update stock set count = count + ? where sname = ? ";
        }
        this.getJdbcTemplate().update(sql, count, sname);
    }

    @Override
    public Stock selectStock(String sname) {
        return null;
    }
}
