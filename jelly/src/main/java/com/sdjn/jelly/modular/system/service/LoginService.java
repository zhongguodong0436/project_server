package com.sdjn.jelly.modular.system.service;

import org.springframework.stereotype.Component;

/**
 * @author 75932
 */
@Component
public interface LoginService {

    /**
     * 用户名密码登录
     * @param username
     * @param password
     * @return
     */
    int accountLogin(String username,String password);
}
