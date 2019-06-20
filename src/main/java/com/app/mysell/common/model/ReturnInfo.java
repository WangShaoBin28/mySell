package com.app.mysell.common.model;

import com.app.mysell.common.enums.ResponseStatusEnum;
import lombok.Data;

import java.util.Optional;

/**
 * @Package com.arrail.common.model
 * @ClassName ReturnInfo
 * @Author zhijun.zhao
 * @Date 2018/9/3  20:03
 * @Version 1.0
 * @Description: 数据返回类
 **/

@Data
public class ReturnInfo<T> {
    private int code;
    private T content;
    private String msg;

    public ReturnInfo() {
    }

    public ReturnInfo(int code, T content) {
        this.code = code;
        this.content = content;
    }

    public ReturnInfo(int code, T content, String msg) {
        this.code = code;
        this.content = content;
        this.msg = msg;
    }

    public Optional<ReturnInfo<T>> optional() {
        return Optional.ofNullable(this);
    }

    /**
     * @param status
     * @return com.arrail.common.model.ReturnInfo
     * @author mengmeng.cao
     * @date 2018/12/10 17:19
     * @description: 根据枚举类型返回实体
     */
    public static <T extends Object> ReturnInfo<T> ofStatus(ResponseStatusEnum status) {
        return new ReturnInfo<>(status.getCode(), null, status.getValue());
    }

    /**
     * @param content
     * @return com.arrail.common.model.ReturnInfo<T>
     * @author mengmeng.cao
     * @date 2018/12/10 17:20
     * @description: 处理正确返回
     */
    public static <T extends Object> ReturnInfo<T> ofSuccess(T content) {
        return new ReturnInfo<>(ResponseStatusEnum.OK.getCode(), content);
    }


    /**
     * @param content
     * @return com.arrail.common.model.ReturnInfo<T>
     * @author mengmeng.cao
     * @date 2018/12/10 17:20
     * @description: 返回code和自定义结果
     */
    public static <T extends Object> ReturnInfo<T> ofCustomize(ResponseStatusEnum status, T content) {
        return new ReturnInfo<>(status.getCode(), content, status.getValue());
    }

    /**
     * @param content
     * @return com.arrail.common.model.ReturnInfo<T>
     * @author mengmeng.cao
     * @date 2018/12/10 17:20
     * @description: 返回code和自定义结果
     */
    public static <T extends Object> ReturnInfo<T> ofCustomize(int code, String msg, T content) {
        return new ReturnInfo<>(code, content, msg);
    }

    /**
     * @return com.arrail.common.model.ReturnInfo<T>
     * @author mengmeng.cao
     * @date 2019/3/12 11:25
     * @description: 没有权限
     */
    public static <T extends Object> ReturnInfo<T> unauthorized(String msg) {
        return new ReturnInfo<>(ResponseStatusEnum.UNAUTHORIZED.getCode(), null, msg);
    }

}
