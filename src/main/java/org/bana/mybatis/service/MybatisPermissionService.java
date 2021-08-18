package org.bana.mybatis.service;

import org.bana.adapter.DataAdapter;
import org.bana.mybatis.entity.Permission;
import org.bana.service.PermissionService;
import org.casbin.jcasbin.main.Enforcer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MybatisPermissionService extends PermissionService<Permission,String> {

  public MybatisPermissionService(
      DataAdapter<Permission, String> dataAdapter,
      Enforcer enforcer) {
    super(dataAdapter, enforcer);
  }

  @Override
  public String fromId(String id) {
    return id;
  }

  @Override
  public String id(String id) {
    return id;
  }
}
