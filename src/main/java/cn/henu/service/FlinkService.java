package cn.henu.service;

import cn.henu.pojo.Link;

import java.util.List;

public interface FlinkService {
    int addFlink(Link link);
    int delFlink(int id);
    int updateFlink(Link link);
    List<Link> findAll();
    Link findById(int id);
}
