package com.app.mysell.entity;

import java.util.Date;
import lombok.Data;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName  ${NAME}
 * @Author shaobin.wang
 * @Date  2019/04/29 17:13
 * @Version 1.0
 * @Description:  
 **/
@Data
public class CommentInfoEntity {
    /**
    * 唯一标识
    */
    private Long id;

    /**
    * 微信用户ID
    */
    private String openId;

    /**
    * 用户名称
    */
    private String name;

    /**
    * 用户头像
    */
    private String avatarUrl;

    /**
    * 评论
    */
    private String content;

    /**
    * 创建时间
    */
    private Date createTime;
}