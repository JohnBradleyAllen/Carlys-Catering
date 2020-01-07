/*
 * @author John B. Allen 
 * 
 */

//Coordinator class holds details about the bartender role.
public abstract class Coordinator extends Employee
{
	//Method to set the pay rate and ensure the pay is not more than allowed by job title.
	public void setPayRate(double payRate) 
	{
		if(payRate <= 20.00)
		{
			this.payRate = payRate;
		}
		
		else 
		{
			System.out.println("Error: Coordinators cannot have a pay rate over $20.00/hour.");
		}
	}
	
	//Method to set job titel. Eclipse recommended the parameter to rid an error.
	public void setJobTitle(String jobTitle) 
	{
		this.jobTitle = jobTitle;
	}
}

