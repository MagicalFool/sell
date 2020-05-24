package com.cc.sell.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfo {

  /**
   *  产品ID
   *  chenchao
   */
  
  @Id
  private String productId;
  
  /**
   * 产品名称
   *  chenchao
   */
  
  private String productName;
  
  /**
   * 产品价格
   *  chenchao
   */
  
  private BigDecimal productPrice;
  
  /**
   * 库存
   *  chenchao
   */
  
  private Integer productStock;
  
  /**
   *  商品描述
   *  chenchao
   */
  
  private String productDescription;
  
  /**
   *  商品图片
   *  chenchao
   */
  
  private String productIcon;
  
  /**
   *  商品状态
   *  chenchao
   */
  
  private Integer productStatus;
  
  /**
   *  商品类型
   *  chenchao
   */
  
  private Integer categoryType;

}
