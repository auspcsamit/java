package com.email;

public class User {
	
	private Login login;
	private String emailTo;
	private String message;
	
	public User(Login login, String emailTo, String message) {
		this.login = login;
		this.emailTo = emailTo;
		this.message = message;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
//	to display from, to, message and mail status
	void display() {
		System.out.println("****************************************");
		System.out.println("*   -----------------------------      *");
		System.out.println("*  |  Mail Sent Successfully...  |     *");
		System.out.println("*   -----------------------------      *");
		System.out.println("*                                      *");
		System.out.println("*" + "\tFrom : " + this.login.getEmail());
		System.out.println("*" + "\tTo: " + this.emailTo);
		System.out.println("*");
		System.out.println("*" + "\tMessage : " + this.message);
		System.out.println("*                                      *");
		System.out.println("****************************************");
		
	}
	
}
