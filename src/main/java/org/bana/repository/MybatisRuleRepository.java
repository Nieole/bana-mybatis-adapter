package org.bana.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bana.entity.MybatisRule;

@Mapper
public interface MybatisRuleRepository extends BaseMapper<MybatisRule> {

}
