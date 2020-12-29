package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private String company;
	private String password;
	private int defaultPasswordLength =10;
	private String email;
	private String alternateEmail;
	private int mailboxCapacity=500;
	private String companySuffix = ".personalprojects.co.uk";

	
	//Constructor to receive first and last name.
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		//call a method asking for the department, then return the department
		this.department = setDepartment();
		
		//combine elements to generate email
		email =  firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+companySuffix;
		
		//call a method that returns a random password.
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password: "+this.password);
		
		
	}
	//Ask for department
	private String setDepartment() {
		System.out.println("NEW WORKER: "+firstName+" "+lastName+"."+"\n\nDEPARTMENT CODES\n----------------\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none\n\nENTER YOUR DEPARTMENT CODE:");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if (departmentChoice == 1) {return "Sales";}
		else if (departmentChoice == 2) {return "Development";}
		else if (departmentChoice == 3) {return "Accounting";}
		else {return "";}

	}
	
	//Generate random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
		char [] password = new char[length];
		for (int i = 0; i<length; i++) {
			
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	//Set mailbox capacity
	public void setMailboxCapacty(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
	}
	//Set the Change Password
	public void changePassword(String newPassword) {
		this.password = newPassword;
		
	}

	public int getMailboxCapacity (){return mailboxCapacity;}
	public String getAlternateEmail (){return alternateEmail;}
	public String getPassword (){return password;}
	
	
	public String showInfo() {
		
		return "DISPLAY NAME: "+firstName+" "+lastName+
				"\nCOMPANY EMAIL: "+email+
				"\nMAILBOX CAPACITY: "+mailboxCapacity+"mb";
				
	}
	
	




}
