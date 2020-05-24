package com.cc.sell.enums;

import lombok.Getter;

/**
 * @Author chenchao
 * @Date 2020/5/18 下午10:52
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"")
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
