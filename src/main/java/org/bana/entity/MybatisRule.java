package org.bana.entity;

import com.baomidou.mybatisplus.annotation.TableId;

public class MybatisRule extends CasbinRule<String>{
  @TableId
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
