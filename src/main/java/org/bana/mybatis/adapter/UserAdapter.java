package org.bana.mybatis.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bana.mybatis.entity.User;

public class UserAdapter extends MybatisAdapter<User,String>{

  public UserAdapter(
      BaseMapper<User> mapper) {
    super(mapper);
  }
}
