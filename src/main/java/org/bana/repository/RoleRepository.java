package org.bana.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bana.entity.Role;

@Mapper
public interface RoleRepository extends BaseMapper<Role> {

}
