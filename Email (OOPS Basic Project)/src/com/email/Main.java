package com.email;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Registration> userReg = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
				System.out.println("********************************");
				System.out.println("*     ------------------       *");
				System.out.println("*    |       MENU       |      *");
				System.out.println("*     ------------------       *");
				System.out.println("*                              *");
				System.out.println("*  1) REGISTRATION             *");
				System.out.println("*  2) LOG-IN                   *");
				System.out.println("*  3) EXIT                     *");
				System.out.println("*                              *");
				System.out.println("********************************");
				
				System.out.print("\nEnter Your Choice : ");
				int choice = sc.nextInt();
	
				Switch s = new Switch();
				i = s.choice(choice, i, userReg);
			
		}while(i==0);
	}
}





















//for(int j=0; j<user.size(); j++)
//{
//	System.out.println(user.get(j).email + " " + user.get(j).password);
//}





//switch(choice) {
//
//	case 1:	System.out.print("Enter email : ");
//			String email = sc.next();
//			System.out.print("\nEnter Password : ");
//			String password = sc.next(); 
//			System.out.print("\nConfirm Password : ");
//			String confirmPassowrd = sc.next(); 
//			Registration r = new Registration(email, password, confirmPassowrd);
//			if( r.isMailValid(r.getEmail()) && r.isPassValid(r.getPassword()) && r.isConfirmPass(r.getPassword(), r.getConfirmPassword()))
//			{
//				System.out.println("Registered Successfully...");
//			}
//			break;
//	case 2:System.out.println("Login");
//			break;
//	case 3: i = 1;
//			break;
//	default:System.out.println("Enter a Valid Key");
//}
