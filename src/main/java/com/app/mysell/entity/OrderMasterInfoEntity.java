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
public class OrderMasterInfoEntity {
    /**
    * 唯一标识
    */
    private Long id;

    /**
    * 买家姓名
    */
    private String buyerName;

    /**
    * 买家手机号
    */
    private String buyerPhone;

    /**
    * 买家桌号
    */
    private Integer buyerAddress;

    /**
    * 买家微信openID
    */
    private String buyerOpenid;

    /**
    * 订单总金额
    */
    private BigDecimal orderAmount;

    /**
    * 订单状态
    */
    private Integer orderStatus;

    /**
    * 支付状态
    */
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;
}