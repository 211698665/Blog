package cn.henu.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.henu.vo.ArticleVo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {

	@RequestMapping(value="/upload/img",method={RequestMethod.POST})
	@ResponseBody
	public String uploadSummerNoteImgs(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		String suffixname = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
		try {
			//指定上传的文件在服务器的位置,这里我放在了webapp/upload文件夹下面
			//request.getServletContext().getRealPath(""),获取到的是绝对路径C:\javaspace\SpringBoot-File\src\main\webapp\
			String realPath = request.getServletContext().getRealPath("/upload");
			File fileDir = new File(realPath);//指定一个文件夹
			if(!fileDir.exists()) {//如果文件夹不存在就创建一个
				fileDir.mkdirs();
			}
			//上传文件的新的名称（为了避免重复）
			String newname=UUID.randomUUID().toString()+"."+suffixname;
			File newfile = new File(fileDir+"/"+newname); //生成文件夹和文件的名称，便于下面的上传
			file.transferTo(newfile);
			 return fileDir+"/"+newname;
		}catch(Exception e) {
			e.printStackTrace();
		}
	   return null;
	}
	//文件上传
	@PostMapping("/upload")
	@ResponseBody
	public String uploadFile(@RequestParam("file")MultipartFile file,HttpServletRequest request) {
		//获取文件的后缀,这样截取的时候是包扩那个点的
		String suffixname = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
		try {
			//指定上传的文件在服务器的位置,这里我放在了webapp/upload文件夹下面
			//request.getServletContext().getRealPath(""),获取到的是绝对路径C:\javaspace\SpringBoot-File\src\main\webapp\
			String realPath = request.getServletContext().getRealPath("/upload");
			File fileDir = new File(realPath);//指定一个文件夹
			if(!fileDir.exists()) {//如果文件夹不存在就创建一个
				fileDir.mkdirs();
			}
			//上传文件的新的名称（为了避免重复）
			String newname=UUID.randomUUID().toString()+"."+suffixname;
			File newfile = new File(fileDir+"/"+newname); //生成文件夹和文件的名称，便于下面的上传
			file.transferTo(newfile);
			return "success";
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "fail";
	}
	
	//批量的文件上传
		@PostMapping("/manyupload")
		@ResponseBody
		//注意这里的名字要和input的name属性一致
		public String manyFileUpload(MultipartFile [] file,HttpServletRequest request,HttpServletRequest response) {
			try {
				//指定上传的文件在服务器的位置,这里我放在了webapp/upload文件夹下面
				//request.getServletContext().getRealPath(""),获取到的是绝对路径C:\javaspace\SpringBoot-File\src\main\webapp\
				String realPath = request.getServletContext().getRealPath("/upload");
				File fileDir = new File(realPath);//指定一个文件夹
				if(!fileDir.exists()) {//如果文件夹不存在就创建一个
					fileDir.mkdirs();
				}
				for(int i=0;i<file.length;i++) {
					//获取文件的后缀,这样截取的时候是包扩那个点的
					String suffixname = file[i].getOriginalFilename().substring(file[i].getOriginalFilename().lastIndexOf('.'));
					//上传文件的新的名称（为了避免重复）
					String newname=UUID.randomUUID().toString()+"."+suffixname;
					File newfile = new File(fileDir+"/"+newname); //生成文件夹和文件的名称，便于下面的上传
					file[i].transferTo(newfile);
				}
				return "success";
			}catch(Exception e) {
				e.printStackTrace();
			}
			return "fail";
	}
		
		
	//文件下载,这种方式可以进行小文件的下载，大文件的话会造成内存溢出，大文件可以用普通的java方式进行下载
	@RequestMapping("/download")
	public ResponseEntity<byte[]> fileDownload(HttpServletRequest request){
		File file = new File("c://IMG//法.jpg");
	    byte[] body = null;
	    InputStream is;
		try {
			is = new FileInputStream(file);
			body = new byte[is.available()];
		    is.read(body);
		    HttpHeaders headers = new HttpHeaders();
		    headers.add("Content-Disposition", "attchement;filename="+new String(file.getName().getBytes("UTF-8"),"iso-8859-1"));
		    HttpStatus statusCode = HttpStatus.OK;
		    ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
		    return entity;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	//传统方式的文件下载
	@RequestMapping(value="/down")  
	@ResponseBody
	public void downLoad( HttpServletResponse response,HttpServletRequest request) throws Exception {
		String filePath="c://IMG//法.jpg";
        File f = new File(filePath);
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(f));
        byte[] buf = new byte[1024];
        int len = 0;
        response.reset(); // 非常重要
        if (true) { // 在线打开方式
            URL u = new URL("file:///" + filePath);
            response.setContentType(u.openConnection().getContentType());
            // 文件名应该编码成UTF-8
            response.setHeader("Content-Disposition", "inline; filename="+new String(f.getName().getBytes("UTF-8"),"iso-8859-1"));
        } else { // 纯下载方式
            response.setContentType("application/x-msdownload");
            response.setHeader("Content-Disposition", "attachment; filename="+new String(f.getName().getBytes("UTF-8"),"iso-8859-1"));
        }
        OutputStream out = response.getOutputStream();
        while ((len = br.read(buf)) > 0)
            out.write(buf, 0, len);
        br.close();
        out.close();
    }
	
}
