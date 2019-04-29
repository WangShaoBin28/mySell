package com.app.mysell.entity;

import java.math.BigDecimal;
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
public class OrderDetailInfoEntity {
    /**
    * 唯一标识
    */
    private Long id;

    /**
    * 订单id
    */
    private Long orderId;

    /**
    * 商品ID
    */
    private Long productId;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 商品价格
    */
    private BigDecimal productPrice;

    /**
    * 商品数量
    */
    private Integer productQuantity;

    /**
    * 小图
    */
    private String productIcon;
}