package com.yueqian.epidemic.common;


import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateConverter implements Converter<String, Date> {


    private SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");

    private static Logger loggeer=Logger.getLogger(DateConverter.class);
    @Override
    public Date convert(String s) {
        Date date=null;
        try {
            date=sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            loggeer.error("日期转换出现错误:"+e.getMessage());
        }
        return date;
    }
}
