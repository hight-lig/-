package com.yueqian.epidemic.service;

import com.yueqian.epidemic.beans.UserInfo;

public interface UserService {
    /**
     * 根据用户账号得到用户信息
     * @param account
     * @return
     */
    UserInfo findByAccount(String account);

}
