package org.bana.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bana.entity.Permission;

public class MybatisPermissionAdapter extends MybatisAdapter<Permission,String> {

  protected MybatisPermissionAdapter(
      BaseMapper<Permission> mapper) {
    super(mapper);
  }
}
