package cn.henu.service.impl;

import cn.henu.dao.NoticeMapper;
import cn.henu.pojo.Notice;
import cn.henu.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class NoticeServiceImpl  implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> findAllNotice() {
        List<Notice> list=new LinkedList<Notice>();
        List<Notice> listRight=new LinkedList<Notice>();
        list=noticeMapper.selectAll();
        for (int i=0;i<list.size();i++){
            if(list.get(i).getNoticeStatus()==1){
                listRight.add(list.get(i));
            }
        }
        return listRight;
    }

    @Override
    public Notice findNoticeById(int id) {
        return noticeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertNotice(Notice notice) {
        return noticeMapper.insert(notice);
    }

    @Override
    public int updateNotice(Notice notice) {
        return noticeMapper.updateByPrimaryKey(notice);
    }

    @Override
    public int delNotice(int id) {
        return noticeMapper.deleteByPrimaryKey(id);
    }
}
