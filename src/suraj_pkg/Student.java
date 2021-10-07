package suraj_pkg;

import java.util.HashMap;

//model class
public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage;
	private String[] favOs;
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
