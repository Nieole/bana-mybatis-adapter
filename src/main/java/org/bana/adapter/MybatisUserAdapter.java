package org.bana.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bana.entity.User;

public class MybatisUserAdapter extends MybatisAdapter<User,String>{

  protected MybatisUserAdapter(
      BaseMapper<User> mapper) {
    super(mapper);
  }
}
