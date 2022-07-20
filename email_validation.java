package emailvalidation;

import java.util.ArrayList;
import java.util.Scanner;

public class email_validation {
	
	  public static void main(String[] args) {
	        
	        ArrayList<String> emailID = new ArrayList<String>();
	        
	        emailID.add("shashank.singh@gmail.com");
	        emailID.add("akash.kumar@gmail.com");
	        emailID.add("monu.1234@gmail.com");
	        emailID.add("anand.kharwar@gmail.com");
	        emailID.add("prince.raj@gmail.com");
	        emailID.add("shivam.singh@gmail.com");
	        emailID.add("alokmishra2000@gmail.com");
	        
	        Scanner scn = new Scanner(System.in);
	        System.out.println("Enter Email-id:");
	        String searchEmail = scn.nextLine();
	        
	        if(emailID.contains(searchEmail)){
	           System.out.println( "email_ID : " + searchEmail + " found");
	        }
	        
	        else{
	        	 System.out.println( "email_ID :" + searchEmail + " not found");
	        }
	    
	    }
}