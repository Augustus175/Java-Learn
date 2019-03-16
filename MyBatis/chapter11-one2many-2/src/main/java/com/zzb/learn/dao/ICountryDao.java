package com.zzb.learn.dao;

import com.zzb.learn.bean.Country;

public interface ICountryDao {
    Country  selectCountryById(int cid);
}
