package org.bana.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.bana.entity.CasbinRule;

@TableName(value = "rule")
public class MybatisRule extends CasbinRule<String> {
  @TableId
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
