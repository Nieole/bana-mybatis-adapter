package org.bana.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bana.entity.User;

public class UserAdapter extends MybatisAdapter<User,String>{

  protected UserAdapter(
      BaseMapper<User> mapper) {
    super(mapper);
  }
}
