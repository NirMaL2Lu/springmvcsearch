package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/fileform")
	public String showUploadForm() {
//		String str="nirmal";
//		Integer.parseInt(str);
		
		return "fileform";
	}
	
	@RequestMapping(value = "/uploadimage" ,method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile   file) {
		System.out.println("image upload successfully....!");
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		return "filesuccess";
	}
}
