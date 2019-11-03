package com.sdjn.jelly.modular.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sdjn.jelly.modular.system.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author 75932
 */
@Mapper
@Component
public interface LoginDao extends BaseMapper<User> {

    /**
     * 用户名密码登录
     *
     * @param username
     * @param password
     * @return
     */
    int accountLogin(@Param("username") String username, @Param("password") String password);
}
