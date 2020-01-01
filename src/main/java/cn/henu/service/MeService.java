package cn.henu.service;

import cn.henu.pojo.Ability;
import cn.henu.pojo.Link;
import cn.henu.pojo.User;

import java.util.List;

public interface MeService {
    int addAbility(Ability ability);
    int delAbilityById(int abilityId);
    List<Ability> findAll();
    int updateById(User user);
    User findByKey(int userId);
    List<Link> findAllLink();
    User findUser(int id);
}
