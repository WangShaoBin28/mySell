package com.app.mysell.entity;

import java.time.LocalDate;
import java.util.Date;
import lombok.Data;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName  ${NAME}
 * @Author shaobin.wang
 * @Date  2019/04/29 17:14
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
    private LocalDate birthday;

    /**
    * 创建时间
    */
    private Date createtime;

    /**
    * 更新时间
    */
    private Date updatetime;
}