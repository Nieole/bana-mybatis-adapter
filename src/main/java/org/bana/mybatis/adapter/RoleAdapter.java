package org.bana.mybatis.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bana.mybatis.entity.Role;

public class RoleAdapter extends MybatisAdapter<Role,String>{

  public RoleAdapter(
      BaseMapper<Role> mapper) {
    super(mapper);
  }
}
