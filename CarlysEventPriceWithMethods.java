/*
 * @John B. Allen
 */

import java.util.Scanner;

public class CarlysEventPriceWithMethods 
{
	public static void main(String[] args)
	{
		int guestNumber = guestInfo();
		displayMotto();
		eventInfo(guestNumber);
	}

	public static int guestInfo()
	{
		int guestNumber;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of guests attending the event: ");
		guestNumber = keyboard.nextInt();
		return guestNumber;
	}

	public static void displayMotto()
	{
		System.out.println("*********************************************");
		System.out.println("Carly's makes the food that makes it a party.");
		System.out.println("*********************************************");	
	}

	public static void eventInfo(int guestNumber)
	{
		int pricePerGuest = 35;
		int totalPrice = guestNumber * pricePerGuest;
		boolean isLargeEvent = (guestNumber >= 50); 
		System.out.println("The total price of the event is $" + totalPrice);
		System.out.println("The event is a large event (50 guests or more): " + isLargeEvent);
	}
}
