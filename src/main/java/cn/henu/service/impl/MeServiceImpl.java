package cn.henu.service.impl;

import cn.henu.dao.AbilityMapper;
import cn.henu.dao.LinkMapper;
import cn.henu.dao.UserMapper;
import cn.henu.pojo.Ability;
import cn.henu.pojo.Link;
import cn.henu.pojo.User;
import cn.henu.service.MeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class MeServiceImpl implements MeService {

    @Autowired
    private AbilityMapper abilityMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LinkMapper linkMapper;
    @Override
    public int addAbility(Ability ability) {
        return abilityMapper.insert(ability);
    }

    @Override
    public int delAbilityById(int abilityId) {
        return abilityMapper.deleteByPrimaryKey(abilityId);
    }

    @Override
    public List<Ability> findAll() {
        return abilityMapper.selectAll();
    }
    public int updateById(User user){
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User findByKey(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    //这个是前台的友情链接查询，后台的在FlinkService里面
    public List<Link> findAllLink() {
        List<Link> list=linkMapper.selectAll();
        List<Link> list2=new LinkedList<>();
        for(int i=0;i<list.size();i++){
            if (list.get(i).getLinkStatus()==1){
                list2.add(list.get(i));
            }
        }
        return list2;
    }
    @Override
    public User findUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
