package com.yueqian.epidemic.mapper;

import com.yueqian.epidemic.beans.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {



    @Select(value = "SELECT " +
            " u.user_id, " +
            " u.account, " +
            " u.`password`, " +
            " u.user_name " +
            "FROM " +
            " users u " +
            "WHERE " +
            " u.account = #{account} " +
            "AND u.del_flag IS NULL " +
            "OR u.del_flag = 0;")
    UserInfo findByAccount(String account);
}
