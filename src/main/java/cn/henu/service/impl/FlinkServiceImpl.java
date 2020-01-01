package cn.henu.service.impl;

import cn.henu.dao.LinkMapper;
import cn.henu.pojo.Link;
import cn.henu.service.FlinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlinkServiceImpl implements FlinkService {
    @Autowired
    private LinkMapper linkMapper;
    @Override
    public int addFlink(Link link) {
        return linkMapper.insert(link);
    }

    @Override
    public int delFlink(int id) {
        return linkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateFlink(Link link) {
        return linkMapper.updateByPrimaryKey(link);
    }

    @Override
    public List<Link> findAll() {
        return linkMapper.selectAll();
    }

    @Override
    public Link findById(int id) {
        return linkMapper.selectByPrimaryKey(id);
    }
}
