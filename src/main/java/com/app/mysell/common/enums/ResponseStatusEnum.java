package com.app.mysell.common.enums;

/**
 * @Package com.arrail.enums
 * @ClassName IsFirstEnum
 * @Author li.chen
 * @Date 2018/12/14 14:23
 * @Version 1.0
 * @Description: http状态码接口返回枚举
 **/
public enum ResponseStatusEnum {
    /**
     * http状态码接口返回枚举
     **/
    OK(200, "成功"),
    BAD_REQUEST(400, "请求异常"),
    UNAUTHORIZED(401, "没有认证或认证非法"),
    FORBIDDEN(403, "用户得到授权，但是访问是被禁止的"),
    UNPROCESSABLE_ENTITY(422, "校验错误"),
    OVERDUE_DATE(422, "预约日期已过，校验失败"),
    OVERDUE_TIME(422, "预约时间已过，校验失败"),
    NUMBER_FULL(422, "当前时段已约满"),
    OCCUPIED_APPOINTMENT(422, "时间被预约占用，校验失败"),
    OCCUPIED_PERSONAL(422, "时间被个人占用，校验失败"),
    COUNT_SATURATED(422, "当前已有五个预约。"),
    INTERNAL_SERVER_ERROR(500, "数据加载失败"),
    DATA_IS_NULL(502, "无数据"),
    DOCTOR_NOT_MATCH_COMPLAINT(503, "医生和主诉不匹配"),
    DOCTOR_NOT_NUMBER(506, "该医生没号源"),
    DOCTOR_NOT_INTENTION(507, "医生不接所选主诉福利");

    private int code;

    private String value;

    ResponseStatusEnum() {
    }

    ResponseStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static ResponseStatusEnum getCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (ResponseStatusEnum u : ResponseStatusEnum.values()) {
            if (u.getCode() == code) {
                return u;
            }
        }
        return ResponseStatusEnum.OK;
    }

    public static String getValue(Integer code) {
        if (code == null) {
            return null;
        }
        for (ResponseStatusEnum u : ResponseStatusEnum.values()) {
            if (u.getCode() == code) {
                return u.getValue();
            }
        }
        return ResponseStatusEnum.OK.getValue();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
