package org.bana.mybatis.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bana.mybatis.entity.Permission;

public class PermissionAdapter extends MybatisAdapter<Permission,String> {

  public PermissionAdapter(
      BaseMapper<Permission> mapper) {
    super(mapper);
  }
}
