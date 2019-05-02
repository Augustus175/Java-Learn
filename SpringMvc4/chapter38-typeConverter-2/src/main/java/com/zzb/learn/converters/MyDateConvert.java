package com.zzb.learn.converters;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class MyDateConvert implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = getSimpleDateFormat(source);
        try {
            return simpleDateFormat.parse(source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private SimpleDateFormat getSimpleDateFormat(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source)) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        }
        if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) {
            simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        }
        if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        }
        return simpleDateFormat;
    }
}
