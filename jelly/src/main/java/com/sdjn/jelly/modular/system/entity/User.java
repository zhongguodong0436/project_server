package com.sdjn.jelly.modular.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sdjn.jelly.core.util.Dates;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 75932
 */
@Data
@Accessors(chain = true)
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableField("id")
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    @TableField("name")
    private String nickname;
    /**
     * 生日
     */
    @JsonFormat(pattern = Dates.Pattern.DATETIME)
    private Date birthday;
    /**
     * 性别：1-男/0-女
     */
    private Integer sex;
//    /**
//     * 是否启用：1/0
//     */
//    private Integer enabled;
}
