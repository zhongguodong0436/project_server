package com.sdjn.jelly.modular.system.controller;

import com.sdjn.jelly.core.base.BaseController;
import com.sdjn.jelly.core.base.Result;
import com.sdjn.jelly.core.constants.BaseEnums;
import com.sdjn.jelly.core.util.Results;
import com.sdjn.jelly.modular.system.dao.UserDao;
import com.sdjn.jelly.modular.system.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Jelly 2019-10-31
 */
@RequestMapping("/sys/user")
@RestController
public class UserController extends BaseController {

    @Autowired
    private UserDao userDao;

    private static List<User> userList = new ArrayList<>();

    // 先静态模拟数据
//    static {
//        User user1 = new User();
//        user1.setUserId(1L);
//        user1.setUsername("lufei");
//        user1.setNickname("蒙奇D路飞");
//        user1.setBirthday(Dates.parseDate("2000-05-05"));
//        user1.setSex(Constants.Sex.MALE);
//        user1.setEnabled(Constants.Flag.YES);
//        userList.add(user1);
//
//        User user2 = new User();
//        user2.setUserId(2L);
//        user2.setUsername("张召强");
//        user2.setNickname("宁阳一哥 阿强");
//        user2.setBirthday(Dates.parseDate("1993/06/18"));
//        user2.setSex(Constants.Sex.MALE);
//        user2.setEnabled(Constants.Flag.YES);
//        userList.add(user2);
//    }

    @RequestMapping("/queryAll")
    public Result queryAll() {
        //List<User> userList = userDao.selectAll();
        List<User> userList = userDao.selectList(null);
        return Results.successWithData(userList, BaseEnums.SUCCESS.code(), BaseEnums.SUCCESS.desc());
    }

    @RequestMapping("/queryOne/{userId}")
    public Result queryOne(@PathVariable Long userId) {
        User user = null;
        for (User u : userList) {
            if (u.getUserId().longValue() == userId) {
                user = u;
            }
        }
        return Results.successWithData(user);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(User user) {
        int i = userDao.insert(user);
        if (i > 0) {
            return Results.success("200", "新增成员成功！");
        } else {
            return Results.failure("新增数据异常！");
        }
    }
}
