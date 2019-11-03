package com.sdjn.jelly.modular.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sdjn.jelly.modular.system.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 75932
 */
@Component
public interface UserDao extends BaseMapper<User> {


    List<User> selectAll ();

}
