package com.cc.sell.VO;

import lombok.Data;

/**
 *  最外层的返回对象
 *  chenchao
 */


@Data
public class ResultVO<T> {


    private String code;

    private String msg;

    private T data;


}
