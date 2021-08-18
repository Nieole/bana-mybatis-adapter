package org.bana.mybatis.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bana.mybatis.entity.Role;

@Mapper
public interface RoleRepository extends BaseMapper<Role> {

}
