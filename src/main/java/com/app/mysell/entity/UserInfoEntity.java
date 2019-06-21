package com.app.mysell.entity;

import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName ${NAME}
 * @Author shaobin.wang
 * @Date 2019/04/29 17:14
 * @Version 1.0
 * @Description:
 **/
@Data
public class UserInfoEntity {
    /**
     * 唯一标识
     */
    private Long id;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户微信号ID
     */
    private String openid;

    /**
     * 出生日
     */
    private Date birthday;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatetime;
}