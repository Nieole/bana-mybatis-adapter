package org.bana.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bana.entity.User;

@Mapper
public interface UserRepository extends BaseMapper<User> {

}
