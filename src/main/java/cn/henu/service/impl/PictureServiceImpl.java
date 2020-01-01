package cn.henu.service.impl;

import cn.henu.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.henu.dao.PhotoMapper;
import cn.henu.pojo.Photo;

import java.util.LinkedList;
import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {

	@Autowired
	private PhotoMapper photoMapper;

	//上传图片
	public String addPhoto(Photo photo) {
		int res=photoMapper.insert(photo);
		return res>0?"success":"fail";
	}
	//查询图片列表
	public List<Photo> findAllPhoto(){
		List<Photo> list=new LinkedList<Photo>();
		List<Photo> listRight=new LinkedList<Photo>();
		list=photoMapper.selectAll();
		for (int i=0;i<list.size();i++){
			if(list.get(i).getPhotoStatus()==1){
				listRight.add(list.get(i));
			}
		}
		return listRight;
	}
	public List<Photo> adminFindAllPhoto(){
		List<Photo> list=new LinkedList<Photo>();
		list=photoMapper.selectAll();

		return list;
	}

	@Override
	public int countPhoto() {
		return photoMapper.countPhotos().size();
	}

	@Override
	public int delPhoto(int id) {
		return photoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updatePhoto(Photo photo) {
		return photoMapper.updateByPrimaryKey(photo);
	}

	@Override
	public Photo findPhotoById(int id) {
		return photoMapper.selectByPrimaryKey(id);
	}

}
