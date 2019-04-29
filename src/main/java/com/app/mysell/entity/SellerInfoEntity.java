package com.app.mysell.entity;

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
public class SellerInfoEntity {
    /**
    * 唯一标识
    */
    private Long id;

    /**
    * 用户名称
    */
    private String userName;

    /**
    * 用户密码
    */
    private String passWord;

    /**
    * 用户手机
    */
    private String phone;

    private Date createTime;

    private Date updateTime;
}