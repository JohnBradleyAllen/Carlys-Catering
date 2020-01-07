/*
 * @author John B. Allen 
 * 
 */

import java.util.Scanner;

//StaffDinnerEvent prompts user for input on event.
public class StaffDinnerEvent 
{
	//Int for number of guests.
	private static int numGuests;

	//Main to hold input parameters.
	public static void main(String[] args)
	{
		int waitstaffCount = 0, bartenderCount = 0, coordinatorCount = 0;
		Scanner scanner = new Scanner(System.in);
		
		DinnerEvent dinnerEvent;
		
		System.out.println("Enter The Event Number: ");
		String eventNum = scanner.next();
		
		System.out.println("Enter The Number Of Guests: ");
		int numberOfGuests = scanner.nextInt();
		
		System.out.println("Please Select Your Menu Options: ");
		String menu = scanner.next();
		
		System.out.println("Enter Contact Phone Number: ");
		String phoneNum = scanner.next();
		
		System.out.println("Enter Employee ID Number: ");
		String employeeIdNumber = scanner.next();
		setEmployeeIdNumber(employeeIdNumber);
		
		System.out.println("Enter Employees Last Name: ");
		String employeeLastName = scanner.next();
		setEmployeeLastName(employeeLastName);
		
		System.out.println("Enter Employees First Name: ");
		String employeeFirstName = scanner.next();
		setEmployeeFirstName(employeeFirstName);	
	
	//If statement to determine waitstaff based on guest count.
	if(numGuests <= 10 && waitstaffCount !=1)
	{
		System.out.println("Only One (1) waitstaff are required. ");
		return;
	}
	
	if(numGuests >= 10 && numGuests > 20 && waitstaffCount !=2)
	{
		System.out.println("Only Two (2) waitstaff are required. ");
		return;
	}
	
	if(numGuests >= 20 && numGuests > 30 && waitstaffCount !=3)
	{
		System.out.println("Only Three (3) waitstaff are required. ");
		return;
	}
	
	if(numGuests >= 30 && numGuests > 40 && waitstaffCount !=4)
	{
		System.out.println("Only Four (4) waitstaff are required. ");
		return;
	}
	
	if(numGuests >= 40 && numGuests > 50 && waitstaffCount !=5)
	{
		System.out.println("Only Five (5) waitstaff are required. ");
		return;
	}
	
	if(numGuests >= 50 && numGuests > 60 && waitstaffCount !=6)
	{
		System.out.println("Only Six (6) waitstaff are required. ");
		return;	
	}
	
	if(numGuests >= 60 && numGuests > 70 && waitstaffCount !=7)
	{
		System.out.println("Only Seven (7) waitstaff are required. ");
		return;	
	}
	
	if(numGuests >= 70 && numGuests > 80 && waitstaffCount !=8)
	{
		System.out.println("Only Eight (8) waitstaff are required. ");
		return;	
	}
	
	if(numGuests >= 80 && numGuests > 90 && waitstaffCount !=9)
	{
		System.out.println("Only Nine (9) waitstaff are required. ");
		return;	
	}
	
	if(numGuests >= 90 && numGuests > 100 && waitstaffCount !=10)
	{
		System.out.println("Only Ten (10) waitstaff are required. ");
		return;	
	}
	
	if(numGuests > 100)
	{
		System.out.println("Event Guest Count Cannot Exceed 100. ");
		return;	
	}
	
	//If statements to determine number of bartenders needed for an event.
	if(numGuests <= 25 && bartenderCount !=1)
	{
		System.out.println("Only One (1) bartender is required. ");
		return;
	}
	
	if(numGuests > 25 && numGuests >= 50 && bartenderCount !=2)
	{
		System.out.println("Only Two (2) bartenders are required. ");
		return;
	}
	
	if(numGuests > 50 && numGuests >= 75 && bartenderCount !=3)
	{
		System.out.println("Only Three (3) bartenders are required. ");
		return;
	}
	
	if(numGuests > 75 && numGuests >= 100 && bartenderCount !=4)
	{
		System.out.println("Only Four (4) bartenders are required. ");
		return;
	}
	
	if(numGuests > 100)
	{
		System.out.println("Event Guest Count Cannot Exceed 100. ");
		return;	
	}
	
	//If statement to determine how many coordinators are needed.
	if(numGuests <= 100 && coordinatorCount !=1)
	{
		System.out.println("Only One (1) coordinator is needed. ");
		return;	
	}
	
	if(numGuests > 100)
	{
		System.out.println("Event Guest Count Cannot Exceed 100. ");
		return;	
	}
	}	
	
	//Setter method to set employee first name.
	private static void setEmployeeFirstName(String employeeFirstName) 
	{
		// TODO Auto-generated method stub
	}

	//Setter method to set employees last name.
	private static void setEmployeeLastName(String employeeLastName) 
	{
		// TODO Auto-generated method stub
	}

	//Setter method to set the employees ID number.
	private static void setEmployeeIdNumber(String employeeIdNumber) 
	{
		// TODO Auto-generated method stub
	}

}
