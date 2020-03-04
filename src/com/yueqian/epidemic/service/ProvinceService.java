package com.yueqian.epidemic.service;

import com.yueqian.epidemic.beans.ProvinceInfo;

import java.util.List;

public interface ProvinceService {

    //传日期返回省份集合
    List<ProvinceInfo> findNoDataProvinces(String date);
}
