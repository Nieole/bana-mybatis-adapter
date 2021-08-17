package org.bana.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bana.entity.Permission;

public class PermissionAdapter extends MybatisAdapter<Permission,String> {

  protected PermissionAdapter(
      BaseMapper<Permission> mapper) {
    super(mapper);
  }
}
