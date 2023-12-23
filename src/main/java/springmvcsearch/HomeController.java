package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {

	@RequestMapping("/home1")
	public String home1() {
		
		
		return "home1";
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String user,Model m) {
		System.out.println(user);
		m.addAttribute("user",user);
		
		
		return "welcome";
	}
	
}
