package cn.henu.service;

import cn.henu.pojo.Photo;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PictureService {

	public String addPhoto(Photo photo);
	public List<Photo> findAllPhoto();
	public int countPhoto();
	public int delPhoto(int id);
	public int updatePhoto(Photo photo);
	public Photo findPhotoById(int id);
	public List<Photo> adminFindAllPhoto();

}
