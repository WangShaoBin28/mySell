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
public class ProductCategoryEntity {
    /**
    * 唯一标识
    */
    private Long id;

    /**
    * 类目名称
    */
    private String categoryName;

    /**
    * 类目编号
    */
    private String categoryType;

    private Date createTime;

    private Date updateTime;
}