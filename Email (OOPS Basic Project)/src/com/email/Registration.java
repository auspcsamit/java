package com.email;

public class Registration {
	
	private String email;
	private String password;
	private String confirmPassword;
	
	public Registration(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public Registration(String email, String password, String confirmPassword) {

		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

//	Email Validation
	boolean isEmailValid(String email) {
		
		String[] s = email.split("@");
		
		if(s.length != 2)
		{
			System.out.println("Invalid Email!!!  TRY AGAIN...");
			return false;
		}
		if(s[0].contains(".com") || s[0].length()==0)
		{
			System.out.println("Invalid Email!!!  TRY AGAIN...");
			return false;
		}
		if(!s[1].substring(s[1].length()-4).equals(".com"))
		{
			System.out.println("Invalid Email!!!  TRY AGAIN...");
			return false;
		}
		
		return true;
	}
	
//	Password Validation
	boolean isPassValid(String password) {
		
		if(password.length() < 8 || password.length() > 15)
		{
			System.out.println("Password length must be between 8-15.  TRY AGAIN...");
			return false;
		}
		
		return true;
	}
	
//	Confirm Password Check
	boolean isConfirmPass(String password, String confirmPassword) {
		
		if(password.equals(confirmPassword))
		{
			return true;
		}
		System.out.println("Password do not match.  TRY AGAIN...");
		return false;
	}
}
