package com.cc.sell.service;

import com.cc.sell.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author chenchao
 * @Date 2020/5/22 下午9:07
 */


@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTest {

    @Resource
    private ProductInfoService productInfoService;


    @Test
    public void testSave(){
        ProductInfo.ProductInfoBuilder builder = ProductInfo.builder();
        builder.productId("111")
                .categoryType(1)
                .productDescription("小蚂蚁")
                .productIcon("http://")
                .productStatus(0)
                .productStock(2)
                .productName("蜡笔");

        productInfoService.save(builder.build());
    }

    public void testFindAllByPage(){

    }


}
