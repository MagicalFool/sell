package com.cc.sell.dataobject;

import lombok.Data;

@Data
public class OrderMaster {

  private String orderId;
  private String buyerName;
  private String buyerPhone;
  private String buyerAddress;
  private String buyerOpenid;
  private double orderAmount;
  private long orderStatus;
  private long payStatus;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }


  public String getBuyerPhone() {
    return buyerPhone;
  }

  public void setBuyerPhone(String buyerPhone) {
    this.buyerPhone = buyerPhone;
  }


  public String getBuyerAddress() {
    return buyerAddress;
  }

  public void setBuyerAddress(String buyerAddress) {
    this.buyerAddress = buyerAddress;
  }


  public String getBuyerOpenid() {
    return buyerOpenid;
  }

  public void setBuyerOpenid(String buyerOpenid) {
    this.buyerOpenid = buyerOpenid;
  }


  public double getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(double orderAmount) {
    this.orderAmount = orderAmount;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }


  public long getPayStatus() {
    return payStatus;
  }

  public void setPayStatus(long payStatus) {
    this.payStatus = payStatus;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
