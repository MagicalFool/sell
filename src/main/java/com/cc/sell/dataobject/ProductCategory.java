package com.cc.sell.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {


  /**
   *  买家类目
   *  chenchao
   */
  
  @Id
  private Integer categoryId;
  
  /**
   * 类目名称
   *  chenchao
   */
  
  private String categoryName;
  
  /**
   * 类目类型
   *  chenchao
   */
  
  private Integer categoryType;
  
  /**
   * 创建时间
   *  chenchao
   */
  
  private java.sql.Timestamp createTime;

  /**
   * 更新时间
   *  chenchao
   */
  
  private java.sql.Timestamp updateTime;


  public ProductCategory(Integer categoryId, String categoryName, Integer categoryType) {
    this.categoryId = categoryId;
    this.categoryName = categoryName;
    this.categoryType = categoryType;
  }
}
