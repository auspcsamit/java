package com.email;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Switch {
	
	int choice (int choice, int i,ArrayList<Registration> userReg) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<User> userData = new ArrayList<>();
		
		switch(choice) {
		
		//	Registration
		case 1:	System.out.println(" ------------------------");
				System.out.println("|     Registration       |");
				System.out.println(" ------------------------");
				System.out.print("\nEnter email : ");
				String email = sc.next();
				System.out.print("\nEnter Password : ");
				String password = sc.next();
				System.out.print("\nConfirm Password : ");
				String confirmPassowrd = sc.next();
				
				Registration r = new Registration(email, password, confirmPassowrd);
				if( r.isEmailValid(r.getEmail()) && r.isPassValid(r.getPassword()) && r.isConfirmPass(r.getPassword(), r.getConfirmPassword()) )
				{
					System.out.println(" ---------------------------------------");
					System.out.println("|     Registered Successfully...        |");
					System.out.println(" ---------------------------------------");
					
					userReg.add(new Registration(r.getEmail(), r.getPassword()));
				}
				return 0;

		//	Login
		case 2: System.out.println(" ------------------");
				System.out.println("|     LOG-IN       |");
				System.out.println(" ------------------");
				System.out.print("Enter email : ");
				String email1 = sc.next();
				System.out.print("\nEnter Password : ");
				String password1 = sc.next();
				
				Login l = new Login(email1, password1);
				if( l.isEmailPresent(l.getEmail(), userReg) && l.isPassMatch(l.getPassword(),userReg) )
				{
					System.out.println(" -------------------------------");
					System.out.println("|     Login Successfully...     |");
					System.out.println(" -------------------------------");
					
//					ArrayList<User> userData = new ArrayList<>();
					
					// After Login function = Compose, Inbox, Log-out
					int j = 0;
					do {
							System.out.println("********************************");
							System.out.println("*     ------------------       *");
							System.out.println("*    |       MENU       |      *");
							System.out.println("*     ------------------       *");
							System.out.println("*                              *");
							System.out.println("*  1) COMPOSE                  *");
							System.out.println("*  2) SENT MAILS               *");
							System.out.println("*  3) LOG-OUT                  *");
							System.out.println("*                              *");
							System.out.println("********************************");
							System.out.print("\nEnter Your Choice : ");
							
							int choose = sc.nextInt();
							
							switch(choose) 
							{
								// Compose
								case 1: System.out.println(" ----------------");
										System.out.println("|    COMPOSE     |");
										System.out.println(" ----------------");
										System.out.print("Enter Receiver Email : ");
										String emailTo = sc.next();
										System.out.print("Enter Your Message Here : ");
										String message = sc.next();
										
										User user = new User(l, emailTo, message);
										
										userData.add(new User(user.getLogin(), user.getEmailTo(), user.getMessage()));
										
										user.display();
										break;
								// Sent Mail
								case 2: System.out.println("       --------------------");
										System.out.println("      |     SENT MAILS     |");
										System.out.println("       --------------------");
										
										// Iterate through ArrayList to 
										// Print all Sent Mails
										for(int k=0; k<userData.size(); k++)
										{
											System.out.println("-----------------------------------------");
											System.out.println("\tFrom : " + userData.get(k).getLogin().getEmail());
											System.out.println("\tTo : " + userData.get(k).getEmailTo());
											System.out.println("\tMessage : " + userData.get(k).getMessage());
											System.out.println("-----------------------------------------");
										}
										break;
								// Log-out
								case 3: System.out.println("       -----------------");
										System.out.println("      |     LOG-OUT     |");
										System.out.println("       -----------------");
										j = 1;
										break;
										
								default : System.out.println("Enter a Valid Key");
							}
					}while(j==0);
				}
				return 0;

		//	Exit
		case 3: System.out.println("    -----------------------------------");
				System.out.println("   |   Thank You! Have a Nice Day :)   |");
				System.out.println("    -----------------------------------");
				return 1;

		default:System.out.println("Enter a Valid Key"); return 0;
	}
  }
}
