package com.email;

import java.util.ArrayList;

public class Login {
	
	private String email;
	private String password;
	
	public Login(String email, String password) {
		this.email = email;
		this.password = password;
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
	
//	Checking If Email is Present in ArrayList or not
	boolean isEmailPresent(String email, ArrayList<Registration> user) {
		
		for(int j=0; j<user.size(); j++)
		{
			if(this.email.equals(user.get(j).getEmail()))
			{
				return true;
			}
		}
		System.out.println("Email not found...");
		return false;
	}
	
//	Checking If Password is Present in ArrayList or not	
	boolean isPassMatch(String password, ArrayList<Registration> user) {
		
		for(int j=0; j<user.size(); j++)
		{
			if(this.password.equals(user.get(j).getPassword()))
			{
				return true;
			}
		}
		System.out.println("Password is incorrect...");
		return false;
	}
}
