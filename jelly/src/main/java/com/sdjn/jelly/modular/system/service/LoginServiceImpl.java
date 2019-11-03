package com.sdjn.jelly.modular.system.service;

import com.sdjn.jelly.modular.system.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author 75932
 */
@Component
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public int accountLogin(String username, String password) {
        System.out.println("RequestParam:" + username + password);
        return loginDao.accountLogin(username, password);
    }

}
