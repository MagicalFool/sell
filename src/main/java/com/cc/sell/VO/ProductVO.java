package com.cc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author chenchao
 * @Date 2020/5/22 下午9:31
 */

@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    private Integer categoryType;
}
