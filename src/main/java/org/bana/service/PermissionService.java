package org.bana.service;

import org.bana.adapter.DataAdapter;
import org.bana.entity.Permission;
import org.casbin.jcasbin.main.Enforcer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class PermissionService extends AbstractPermissionService<Permission,String> {

  public PermissionService(
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
