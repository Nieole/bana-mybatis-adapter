package org.bana.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import org.bana.entity.RoleEntity;

public class Role extends RoleEntity<String> {
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
