package org.bana.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bana.entity.Role;

public class MybatisRoleAdapter extends MybatisAdapter<Role,String>{

  protected MybatisRoleAdapter(
      BaseMapper<Role> mapper) {
    super(mapper);
  }
}
