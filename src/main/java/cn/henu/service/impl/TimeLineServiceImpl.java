package cn.henu.service.impl;


import cn.henu.dao.SayingMapper;
import cn.henu.dao.TimelineMapper;
import cn.henu.pojo.Saying;
import cn.henu.pojo.Timeline;
import cn.henu.service.TimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class TimeLineServiceImpl implements TimelineService {
    @Autowired
    private SayingMapper sayingMapper;

    @Autowired
    private TimelineMapper timelineMapper;

    @Override
    public List<Saying> findAllSaying() {
        return sayingMapper.selectAll();
    }
    @Override
    public List<Timeline> findAllTimeLine() {
        return timelineMapper.selectAll();
    }
    @Override
    public Timeline findTimelineById(int id) {
        return timelineMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertTimeline(Timeline timeline) {
        return timelineMapper.insert(timeline);
    }

    @Override
    public int updateTimeline(Timeline timeline) {
        return timelineMapper.updateByPrimaryKey(timeline);
    }

    @Override
    public int delTimeline(int id) {
        return timelineMapper.deleteByPrimaryKey(id);
    }
    @Override
    public Saying findSayingById(int id) {
        return sayingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertSaying(Saying saying) {
        return sayingMapper.insert(saying);
    }

    @Override
    public int updateSaying(Saying saying) {
        return sayingMapper.updateByPrimaryKey(saying);
    }

    @Override
    public int delSaying(int id) {
        return sayingMapper.deleteByPrimaryKey(id);
    }
}
