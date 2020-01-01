package cn.henu.service;

import cn.henu.pojo.Notice;

import java.util.List;

public interface NoticeService {

    public List<Notice> findAllNotice();
    public Notice findNoticeById(int id);
    public int insertNotice(Notice notice);
    public int updateNotice(Notice notice);
    public int delNotice(int id);
}
