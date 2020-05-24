package com.cc.sell.service;

import com.cc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author chenchao
 * @Date 2020/5/24 上午10:04
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryIdIn(List<Integer> list);

    ProductCategory save(ProductCategory productCategory);
}
