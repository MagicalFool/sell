package com.cc.sell.controller;

import com.cc.sell.VO.ResultVO;
import com.cc.sell.dataobject.ProductInfo;
import com.cc.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenchao
 * @Date 2020/5/20 下午5:09
 */

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @RequestMapping("/list")
    public ResultVO<Object> list(){
       return new ResultVO<Object>();
    }
}
