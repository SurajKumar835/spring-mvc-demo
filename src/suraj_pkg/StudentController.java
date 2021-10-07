package suraj_pkg;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	// add @InitBinder annotations for validation of string input as null remove whitespace
	@InitBinder
	public void initBinder(WebDataBinder data)
	{
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		data.registerCustomEditor(String.class, editor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		//create new student object
		Student s=new Student();
		model.addAttribute("student", s);
		return "studentForm";
	}
	@RequestMapping("/processForm")
	//way to add validation in form using hibernator-Validator @valid & Binding Result
	public String processForm(@Valid @ModelAttribute("student") Student thestudent,
				BindingResult theResult)
	{
		System.out.println(thestudent.getFirstName());
		System.out.println(thestudent.getLastName());
		System.out.println(thestudent.getCountry());
		System.out.println(thestudent.getFavLanguage());
		//check binding result what it return on basis of its boolean value direct the user to act
		if(theResult.hasErrors())
		{
			return "studentForm";
		}else
		{
			return "studentProcess";
		}
				
	}
}
