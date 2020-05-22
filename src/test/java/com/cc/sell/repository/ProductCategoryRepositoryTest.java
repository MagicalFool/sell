package com.cc.sell.repository;


import com.alibaba.fastjson.JSON;
import com.cc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void testFindOne(){

        ProductCategory one = repository.findOne(1);

        System.out.println(JSON.toJSON(one));
        Assert.assertNotNull(one);

    }

    @Test
    public void testSave(){
        ProductCategory productCategory = new ProductCategory(1,"女生最爱",2);
        ProductCategory save = repository.save(productCategory);

        Assert.assertNotNull(save);

    }

    @Test
    public void test(){
        List<ProductCategory> byCategoryIdIn = repository.findByCategoryIdIn(Arrays.asList(1, 2));
        System.out.println(byCategoryIdIn);
    }
}
