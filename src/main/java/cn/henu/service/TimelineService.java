package cn.henu.service;

import cn.henu.pojo.Saying;
import cn.henu.pojo.Timeline;

import java.util.List;

public interface TimelineService {
    public List<Saying> findAllSaying();
    public Saying findSayingById(int id);
    public int insertSaying(Saying saying);
    public int updateSaying(Saying saying);
    public int delSaying(int id);
    public Timeline findTimelineById(int id);
    public int insertTimeline(Timeline timeline);
    public int updateTimeline(Timeline timeline);
    public int delTimeline(int id);
    public List<Timeline> findAllTimeLine();
}
