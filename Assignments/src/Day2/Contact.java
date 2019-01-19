package Day2;

import java.util.Scanner;

public class Contact {
	private String fName, lName, dob, gender, anniversary, address, area, city , pin, state, country, telephone, mobile, email, website;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(String anniversary) {
		this.anniversary = anniversary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	public static void validate() throws ValueNotFoundException {
		if(!c.getEmail().isEmpty()){
			throw new ValueNotFoundException("Value not found");
			}
		if(!c.getfName().isEmpty()){
			throw new ValueNotFoundException("Value not found");
			}
		if(!c.getlName().isEmpty()){
			throw new ValueNotFoundException("Value not found");
			}
		if(!c.getDob().isEmpty()){
			throw new ValueNotFoundException("Value not found");
			}	
		 
	}
	
	
	
	public static void main(String[] args){
		Contact c = new Contact();
		Scanner sc = new Scanner(System.in);
		
		c.fName = sc.nextLine(); c.lName = sc.nextLine();
		c.dob = sc.nextLine(); c.email = sc.nextLine();
		System.out.println("first name");
		c.setfName(c.fName);
		c.setlName(c.lName);
		c.setDob(c.dob);
		c.setEmail(c.email);
		try{
			c.validate();
		}
		catch(ValueNotFoundException e)
		{ 
			System.out.println("Please fill all values");
		//throw new ValueNotFoundException("Not found");
		}
	}
	
	
	
	
}
