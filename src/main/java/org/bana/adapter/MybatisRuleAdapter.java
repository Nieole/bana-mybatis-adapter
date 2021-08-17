package org.bana.adapter;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import io.vavr.collection.List;
import org.bana.entity.MybatisRule;
import org.bana.repository.MybatisRuleRepository;
import org.casbin.jcasbin.model.Assertion;
import org.springframework.util.StringUtils;

public class MybatisRuleAdapter implements Adapter<MybatisRule> {
  private final MybatisRuleRepository repository;
  private volatile boolean isFiltered = true;

  public MybatisRuleAdapter(MybatisRuleRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<MybatisRule> transform(Assertion assertion) {
    if (assertion.policy.isEmpty()) {
      return io.vavr.collection.List.empty();
    }
    return io.vavr.collection.List.ofAll(assertion.policy)
        .map(p -> {
          MybatisRule rule = new MybatisRule();
          rule.setPtype(assertion.key);
          rule.setV0(p.get(0));
          if (p.size() >= 2) {
            rule.setV1(p.get(1));
          }
          if (p.size() >= 3) {
            rule.setV2(p.get(2));
          }
          if (p.size() >= 4) {
            rule.setV3(p.get(3));
          }
          if (p.size() >= 5) {
            rule.setV4(p.get(4));
          }
          if (p.size() >= 6) {
            rule.setV5(p.get(5));
          }
          if (p.size() >= 7) {
            rule.setV6(p.get(6));
          }
          if (p.size() >= 8) {
            rule.setV7(p.get(7));
          }
          return rule;
        });
  }

  @Override
  public void setIsFiltered(Boolean isFiltered ) {
    this.isFiltered = isFiltered;
  }

  @Override
  public java.util.List<MybatisRule> loadAllRule() {
    return repository.selectList(null);
  }

  @Override
  public void deleteAll() {
    repository.delete(Wrappers.<MybatisRule>lambdaQuery().isNotNull(MybatisRule::getId));
  }

  @Override
  public void saveAll(java.util.List<MybatisRule> rules) {
    rules.forEach(repository::insert);
  }

  @Override
  public boolean isFiltered() {
    return isFiltered;
  }

  @Override
  public void addPolicy(String sec, String ptype, java.util.List<String> rule) {
    MybatisRule r = new MybatisRule();
    r.setPtype(ptype);
    if (StringUtils.hasText(rule.get(0))) {
      r.setV0(rule.get(0));
    }
    if (rule.size() > 1 && StringUtils.hasText(rule.get(1))) {
      r.setV1(rule.get(1));
    }
    if (rule.size() > 2 && StringUtils.hasText(rule.get(2))) {
      r.setV2(rule.get(2));
    }
    if (rule.size() > 3 && StringUtils.hasText(rule.get(3))) {
      r.setV3(rule.get(3));
    }
    if (rule.size() > 4 && StringUtils.hasText(rule.get(4))) {
      r.setV4(rule.get(4));
    }
    if (rule.size() > 5 && StringUtils.hasText(rule.get(5))) {
      r.setV5(rule.get(5));
    }
    if (rule.size() > 6 && StringUtils.hasText(rule.get(6))) {
      r.setV6(rule.get(6));
    }
    if (rule.size() > 7 && StringUtils.hasText(rule.get(7))) {
      r.setV7(rule.get(7));
    }
    repository.insert(r);
  }

  @Override
  public void removeFilteredPolicy(String sec, String ptype, int fieldIndex,
      String... fieldValues) {
    if (fieldValues.length == 0) {
      return;
    }
    repository.delete(Wrappers.<MybatisRule>query()
        .eq("ptype",ptype)
        .func(mybatisRuleLambdaQueryWrapper -> {
          int count = fieldIndex;
          for (String fieldValue : fieldValues) {
            mybatisRuleLambdaQueryWrapper.eq("v"+count,fieldValue);
            count++;
          }
        })
    );
  }
}
