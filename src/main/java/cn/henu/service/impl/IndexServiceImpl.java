package cn.henu.service.impl;

import cn.henu.dao.ArticleMapper;
import cn.henu.dao.PhotoMapper;
import cn.henu.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl  implements IndexService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private PhotoMapper photoMapper;
}
