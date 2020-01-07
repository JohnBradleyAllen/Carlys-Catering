/*
 * @author John B. Allen 
 * 
 */

////Waitstaff class holes details about the bartender role.
public abstract class Waitstaff extends Employee
{
	//Method to set the pay rate and ensure the pay is not more than allowed by job title.
	public void setPayRate(double payRate) 
	{
		if(payRate <= 10.00)
		{
			this.payRate = payRate;
		}
		
		else 
		{
			System.out.println("Error: Waitstaff cannot have a pay rate over $10.00/hour.");
		}
	}
	
	//Method to set job titel. Eclipse recommended the parameter to rid an error.
	public void setJobTitle(String jobTitle) 
	{
		this.jobTitle = jobTitle;
	}
}