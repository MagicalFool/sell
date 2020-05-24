package com.cc.sell.service;

import com.cc.sell.dataobject.ProductCategory;
import com.cc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author chenchao
 * @Date 2020/5/16 上午9:11
 */
public interface ProductInfoService {

    List<ProductInfo> findByProductStatus(Integer status);

    ProductInfo findOne(String productId);


    List<ProductInfo> findUpAll();


    Page<ProductInfo> findAllByPage(Pageable pageable);


    ProductInfo save(ProductInfo productInfo);

    // 加库存

    // 减库存

}
