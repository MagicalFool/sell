package com.cc.sell.service;

import com.alibaba.fastjson.JSON;
import com.cc.sell.dataobject.ProductInfo;
import com.cc.sell.enums.ProductStatusEnum;
import org.junit.Test;
import org.junit.runner.Request;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author chenchao
 * @Date 2020/5/22 下午9:07
 */


@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoServiceTest {

    @Resource
    private ProductInfoService productInfoService;


    @Test
    public void testSave(){
        ProductInfo.ProductInfoBuilder builder = ProductInfo.builder();
        builder.productId("333")
                .categoryType(2)
                .productDescription("Apple Phone")
                .productIcon("http://")
                .productStatus(0)
                .productStock(2)
                .productName("iPhone");

        productInfoService.save(builder.build());
    }

    @Test
    public void testFindProductByStatus(){
        List<ProductInfo> byProductStatus = productInfoService.findByProductStatus(ProductStatusEnum.UP.getCode());
        System.out.println(JSON.toJSONString(byProductStatus));
    }

    @Test
    public void testFindAllByPage(){

        Page<ProductInfo> allByPage = productInfoService.findAllByPage(new PageRequest(0, 2));

        System.out.println(JSON.toJSON(allByPage.getContent()));

    }


}
