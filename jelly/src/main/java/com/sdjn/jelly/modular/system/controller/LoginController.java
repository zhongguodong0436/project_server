package com.sdjn.jelly.modular.system.controller;

import com.sdjn.jelly.core.base.BaseController;
import com.sdjn.jelly.core.base.Result;
import com.sdjn.jelly.core.util.Results;
import com.sdjn.jelly.modular.system.dao.UserDao;
import com.sdjn.jelly.modular.system.entity.User;
import com.sdjn.jelly.modular.system.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 75932 2019-11-01
 */
@RequestMapping("/sys/login")
@RestController
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "/accountLogin", method = RequestMethod.POST)
    public Result accountLogin(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        int i = loginService.accountLogin(username, password);
        if (i > 0) {
            return Results.success("登录成功！");
        }else{
            return Results.failure("登陆失败！");
        }
    }
}
