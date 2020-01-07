/*
 * @author John B. Allen
 * 
 */

//The DinnerEvent class that allows users to input their food choices.
public class DinnerEvent extends Event
{
	//Employee array.
	Employee employee[];
	
	//integers from wk10 assignment.
	int entreeChoice;
	int sideChoice1;
	int sideChoice2;
	int dessertChoice;
	
	//Array that stores at least 3 objects in each
	final String[] ENTREES = {"Beef", "Chicken", "Vegetarian", "Seafood"};
	final String[] SIDES = {"Mashed Potatoes & Gravy", "House Salad with Dressing", "Vegetable Medley", "Coffee with Baileys"};
	final String[] DESSERTS = {"Cake", "Milk Shake", "Apple & Cheese Board"};
	
	//constructor that requires arguments for an event number and number of guests, and integer menu choices for one entrée, two side dishes, and one dessert.
	public DinnerEvent(String num, int guests, int choice1, int choice2, int choice3, int choice4)
	{
		super(num, guests);
		
	      if(choice1 < ENTREES.length)
	         entreeChoice = choice1;
	      else
	         entreeChoice = 0;
	      
	      if(choice2 < SIDES.length)
	         sideChoice1 = choice2;
	      else
	         sideChoice1 = 0;
	      
	      if(choice3 < ENTREES.length)
	         sideChoice2 = choice3;
	      else
	         sideChoice2 = 0;
	      
	      if(choice4 < DESSERTS.length)
	         dessertChoice = choice4;
	      else
	         dessertChoice = 0;
	}
	  
	//Method that builds and returns a String including the Strings for the four menu choices
	public String getMenu()
	{
		String menu = ENTREES[entreeChoice] + ", " + SIDES[sideChoice1] + ", " + SIDES[sideChoice2] + ", and " + DESSERTS[dessertChoice];
	      return menu;
	}
	
	//Getter method to get employee.
	public Employee[]getEmployee()
	{
		return employee;
	}
	
	//Setter method to set employee.
	public void setEmployee(Employee[]employee)
	{
		this.employee = employee;
	}	
}
