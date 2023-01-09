package week2Practice;
import java.util.*;  
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempts = 0;
		while (attempts < 2) {
			Scanner sc= new Scanner(System.in);    
			System.out.print("Enter username:  ");   
			String username = sc.nextLine();   
			System.out.print("Enter password: "); 
			String password = sc.nextLine();               
			if (username.equals("samy123") && password.equals("12345")) {
			 System.out.println("Welcome back " + username);
			    } else { 
			 System.out.println("Inaccurate credentials!"); 
			} // end of else

			  attempts += 1; 

			}
		System.out.println("You are locked out after " + attempts + " attempts.");
		}
	}

