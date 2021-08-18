package org.bana.mybatis.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bana.mybatis.entity.Permission;

@Mapper
public interface PermissionRepository extends BaseMapper<Permission> {

}
