package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	//here we use @PathVariable Annoations
	@RequestMapping("/user/{id}/{name}")
	public String getUserDetails(@PathVariable("id")int id,@PathVariable("name") String name) {
		
		System.out.println(id);
		System.out.println(name);
		return "home";
	}
	
	@RequestMapping("/complex")
	public String showForm() {
		
		return "complexform";
	}
	
	@RequestMapping( path = "/handleform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("student") Student student,BindingResult result) {
		
		if (result.hasErrors()) {
			
			return "complexform";
		}
		
		
		System.out.println(student);
		System.out.println(student.getAddress());
//		System.out.println(name);
//		System.out.println(id);
		return "success";
	}
}




//public String handleForm(@RequestParam("name") String name,@RequestParam("id") Long id)