package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		String str="nirmal";
		Integer.parseInt(str);
//		System.out.println(str.length());
		System.out.println("This is home handler");
		return "home";
	}
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query)  {
		
		String url="https://www.google.com/search?q="+query;
		
		
		RedirectView rv=new RedirectView();
		rv.setUrl(url);
		
		return rv;
	}
	
//	@ExceptionHandler(value = NullPointerException.class)
//	public String exceptionHandler1(Model m) {
//		m.addAttribute("msg","Number format exception");
//		return "errorpage";
//	}
//	@ExceptionHandler(value = Exception.class)
//	public String exceptionHandler2(Model m) {
//		m.addAttribute("msg","Exception has occured..");
//		return "errorpage";
//	}
	
}
