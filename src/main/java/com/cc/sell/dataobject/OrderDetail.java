package com.cc.sell.dataobject;

import lombok.Data;

@Data
public class OrderDetail {

  private String detailId;
  private String orderId;
  private String productId;
  private String productName;
  private double productPrice;
  private long productQuantity;
  private String productIcon;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;

}
