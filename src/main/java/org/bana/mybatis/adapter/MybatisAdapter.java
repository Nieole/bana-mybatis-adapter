package org.bana.mybatis.adapter;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.vavr.collection.List;
import java.io.Serializable;
import java.util.Collection;
import org.bana.adapter.DataAdapter;
import org.bana.entity.BaseEntity;

public abstract class MybatisAdapter<DATA extends BaseEntity<ID>,ID extends Serializable> implements
    DataAdapter<DATA,ID> {
  private final BaseMapper<DATA> mapper;

  protected MybatisAdapter(BaseMapper<DATA> mapper) {
    this.mapper = mapper;
  }

  public BaseMapper<DATA> getMapper() {
    return mapper;
  }

  @Override
  public boolean save(DATA data) {
    return mapper.insert(data) == 1;
  }

  @Override
  public boolean batchSave(Collection<DATA> datas) {
    return List.ofAll(datas)
        .map(mapper::insert)
        .sum().intValue() == datas.size();
  }

  @Override
  public DATA select(ID id) {
    return mapper.selectById(id);
  }

  @Override
  public Collection<DATA> batchSelect(Collection<ID> ids) {
    return mapper.selectBatchIds(ids);
  }

  @Override
  public boolean update(DATA data) {
    return mapper.updateById(data) == 1;
  }

  @Override
  public boolean batchUpdate(Collection<DATA> datas) {
    return List.ofAll(datas)
        .map(mapper::updateById)
        .sum().intValue() == datas.size();
  }

  @Override
  public boolean delete(DATA data) {
    return mapper.deleteById(data.id()) == 1;
  }

  @Override
  public boolean delete(ID id) {
    return mapper.deleteById(id) == 1;
  }

  @Override
  public boolean batchDelete(Collection<DATA> datas) {
    return List.ofAll(datas)
        .map(mapper::deleteById)
        .sum().intValue() == datas.size();
  }

  @Override
  public boolean batchDeleteById(Collection<ID> ids) {
    return mapper.deleteBatchIds(ids) == ids.size();
  }
}
