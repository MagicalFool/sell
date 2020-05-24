package com.cc.sell.service;

import com.cc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Author chenchao
 * @Date 2020/5/24 上午10:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceTest {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    public void testFindOne(){
        ProductCategory one = productCategoryService.findOne(1);

        Assert.assertNotNull(one);
    }


    @Test
    public void testFindAll(){
        List<ProductCategory> all = productCategoryService.findAll();
        Assert.assertNull(all);
    }

    @Test
    public void testFindByCategoryIdIn(){
        List<ProductCategory> byCategoryIdIn = productCategoryService.findByCategoryIdIn(Arrays.asList(1, 2));
        Assert.assertSame(byCategoryIdIn.size(),2);
    }
}
