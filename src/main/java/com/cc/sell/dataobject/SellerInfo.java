package com.cc.sell.dataobject;

import lombok.Data;

@Data
public class SellerInfo {

  private String id;
  private String username;
  private String password;
  private String openid;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;

}
