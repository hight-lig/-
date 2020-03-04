package com.yueqian.epidemic.beans;

public class ProvinceInfo {
    //省份编号
    private Integer provinceId;
    //省份名称
    private String provinceName;
    //省份拼音
    private String provincePinYing;

    public Integer getProvinceId() {
        return provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getProvincePinYing() {
        return provincePinYing;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvincePinYing(String provincePinYing) {
        this.provincePinYing = provincePinYing;
    }
}
