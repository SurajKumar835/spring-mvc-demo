package suraj_pkg;

import java.util.HashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import suraj_pkg_validation.CourseCode;

//model class
public class Student {
	@NotNull(message="required")
	 
	private String firstName;
	@NotNull(message="required")
	@Size(min=1,max=10,message="should be less than 10 characters")
	private String lastName;
	private String country;
	private String favLanguage;
	//custom Validation 
	@CourseCode(value="SUN" ,message = "must start with SUN")
	private String courseCode;
	private String[] favOs;
	
	
	
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@NotNull(message="required")
	@Min(value=1,message="Way should be greater than 0")
	@Max(value=9,message="Way should be less than 10")
	private int noWay;
	public int getNoWay() {
		return noWay;
	}

	public void setNoWay(int noWay) {
		this.noWay = noWay;
	}

	private HashMap<String,String> countryOpt=new HashMap<String, String>();
	
	public Student() {
		countryOpt.put("BR", "Brazil");
		countryOpt.put("IN", "India");
		countryOpt.put("SW", "Sweden");
		countryOpt.put("RU", "Russia");
		countryOpt.put("US", "USA");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		
		this.country = countryOpt.get(country);
	}

	public HashMap<String, String> getCountryOpt() {
		return countryOpt;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public String[] getFavOs() {
		return favOs;
	}

	public void setFavOs(String[] favOs) {
		
		this.favOs = favOs;
	}



	
	
}
