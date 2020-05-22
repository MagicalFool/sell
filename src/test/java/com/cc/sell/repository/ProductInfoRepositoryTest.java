package com.cc.sell.repository;

import com.cc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author chenchao
 * @Date 2020/5/12 下午5:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository repository;

    @Test
    public void test() {
        PageRequest request = new  PageRequest(0,2);
        Page<ProductInfo> all = repository.findAll(request);
        Assert.assertSame(all.getSize(),2);

    }
}
