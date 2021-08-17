package org.bana.entity;

import com.baomidou.mybatisplus.annotation.TableId;

public class Permission extends PermissionEntity<String>{
  @TableId
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String id() {
    return id;
  }
}
