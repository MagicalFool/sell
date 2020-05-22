package com.cc.sell.repository;

import com.cc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * hello
 *  chenchao
 */

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    Page<ProductInfo> findAll(Pageable page);


}
