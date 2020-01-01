package cn.henu.dao;

import cn.henu.pojo.Music;
import cn.henu.pojo.MusicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusicMapper {
    int countByExample(MusicExample example);

    int deleteByExample(MusicExample example);

    int deleteByPrimaryKey(Integer musicId);

    int insert(Music record);

    int insertSelective(Music record);

    List<Music> selectByExample(MusicExample example);

    Music selectByPrimaryKey(Integer musicId);

    int updateByExampleSelective(@Param("record") Music record, @Param("example") MusicExample example);

    int updateByExample(@Param("record") Music record, @Param("example") MusicExample example);

    int updateByPrimaryKeySelective(Music record);

    int updateByPrimaryKey(Music record);
}