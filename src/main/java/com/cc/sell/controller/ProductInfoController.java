package com.cc.sell.controller;

import com.cc.sell.dataobject.ProductInfo;
import com.cc.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author chenchao
 * @Date 2020/5/20 下午5:09
 */

@Controller
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @RequestMapping("/save")
    @ResponseBody
    public String save(ProductInfo productInfo){
        productInfoService.save(productInfo);
        return "ok";
    }
}
