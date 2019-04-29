package com.app.mysell.entity;

import java.math.BigDecimal;
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
public class ProductInfoEntity {
    /**
    * 唯一标识
    */
    private Long id;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 商品单价
    */
    private BigDecimal productPrice;

    /**
    * 库存
    */
    private Integer productStock;

    /**
    * 商品描述
    */
    private String productDescription;

    /**
    * 商品小图
    */
    private String producticon;

    /**
    * 商品上下架 1正常 2下架
    */
    private Integer productStatus;

    /**
    * 类目编号
    */
    private Integer categoryType;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}