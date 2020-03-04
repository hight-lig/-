package com.yueqian.epidemic.service.impl;

import com.yueqian.epidemic.beans.ProvinceInfo;
import com.yueqian.epidemic.mapper.ProvinceMapper;
import com.yueqian.epidemic.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class provinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;
    @Override
    public List<ProvinceInfo> findNoDataProvinces(String date) {
        short year=0,month=0,day=0;
        List<ProvinceInfo> list = null;
        String[] array = date.split("-");
        if (array.length >= 3) {
            year = Short.parseShort(array[0]);
            month = Short.parseShort(array[1]);
            day = Short.parseShort(array[2]);
            list = this.provinceMapper.findNoDataProvinces(year, month, day);
        }
        return list;
    }
}
