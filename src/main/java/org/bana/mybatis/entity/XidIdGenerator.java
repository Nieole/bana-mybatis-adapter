package org.bana.mybatis.entity;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.github.shamil.Xid;

public class XidIdGenerator implements IdentifierGenerator {

  @Override
  public Number nextId(Object entity) {
    return null;
  }

  @Override
  public String nextUUID(Object entity) {
    return Xid.string();
  }
}
