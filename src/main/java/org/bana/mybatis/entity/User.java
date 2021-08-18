package org.bana.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import org.bana.entity.UserEntity;

public class User extends UserEntity<String> {
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
