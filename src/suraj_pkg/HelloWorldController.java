package suraj_pkg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-form";
	}
	
	
	/*public String processForm()
	{
		return "helloworld";
	}
	*/ 
	//one way of reading data from model other way is written below this code
	/*@RequestMapping("/processForm")
	public String useModel(HttpServletRequest request,Model model)
	{
		String name=request.getParameter("studentName");
		String uName=name.toUpperCase();
		model.addAttribute("message", uName);
		return "helloworld";
		
	}*/
	//*********************************************************//
	@RequestMapping("/processForm")
	public String useModel(@RequestParam("studentName") String name,Model model)
	{
		String uName=name.toUpperCase();
		model.addAttribute("message", uName);
		return "helloworld";
		
	}
	
}
