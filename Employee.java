/*
 * @author John B. Allen 
 * 
 */

//Employee class to hold data fields about employees.
public abstract class Employee 
{
	//Fields.
	private String employeeIdNumber;
	private String lastName;
	private String firstName;
	protected double payRate;
	protected String jobTitle;

//Getter method that returns Employee ID number.
public String getEmployeeIdNumber()
{
   return employeeIdNumber;
}

//Getter method to get employees last name.
public String getLastName()
{
   return lastName;
}

//Getter method to get employees first name.
public String getFirstName()
{
   return firstName;
}

//Getter method to get employees pay rate.
public double getPayRate()
{
   return payRate;
}

//Getter method to get the employees job title.
public String getJobTitle()
{
   return jobTitle;
}

//Setter method to set the employees ID number.
public void setEmployeeIdNumber(String employeeIdNumber)
{
   this.employeeIdNumber = employeeIdNumber;
}

//Setter method to set the employees last name.
public void setLastName(String lastName)
{
   this.lastName = lastName;
}

//Setter method to set the employees first name.
public void setFirstName(String firstName)
{
   this.firstName = firstName;
}

//Abstract setter method to set the employees pay rate.
public abstract void setPayRate(double payRate);

//Abstract setter method to set the employees job title. 
public abstract void setJobTitle();

}
