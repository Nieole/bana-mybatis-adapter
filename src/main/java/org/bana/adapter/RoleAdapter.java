package org.bana.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bana.entity.Role;

public class RoleAdapter extends MybatisAdapter<Role,String>{

  protected RoleAdapter(
      BaseMapper<Role> mapper) {
    super(mapper);
  }
}
