/*
 * @author John B. Allen 
 * 
 */

//Bartender class holes details about the bartender role.
public abstract class Bartender extends Employee
{
	//Method to set the pay rate and ensure the pay is not more than allowed by job title.
	public void setPayRate(double payRate) 
	{
		if(payRate <= 14.00)
		{
			this.payRate = payRate;
		}
		
		else
		{
			System.out.println("Error: Bartenders cannot have a pay rate over $14.00/hour.");
		}
	}
	
	//Method to set job titel. Eclipse recommended the parameter to rid an error.
	public void setJobTitle(String jobTitle) 
	{
		this.jobTitle = jobTitle;
	}
}

