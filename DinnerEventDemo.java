/*
 * @author John B. Allen 
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class DinnerEventDemo 
{
	//Main to run the commands to display a correct output.
	public static void main(String[] args)
	{
		//The array to return 8 events.
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
			final int SIZE = 8;
			int eventType;
		Event[] eventObjects = new Event[SIZE];
			int guestNum;
			for(int i = 0; i < eventObjects.length; i++)
			{
				eventObjects[i] = new Event(null, i, null);
			System.out.println("Enter Event Number: ");
				eventType = scanner.nextInt();
			String eventNo = String.valueOf(eventType);
				eventObjects[i].setEventNum(eventNo);
				eventObjects[i].setEventType(eventType);
			System.out.println("Event Name: " + eventObjects[i].getEvents());
				eventObjects[i].setPhoneNumber();
			do
			{
				System.out.println("Enter The Number Of Guests: ");
				guestNum = scanner.nextInt();
				if(guestNum < 5 || guestNum > 100)

			System.out.println("The Number Of Guests Must Be Between 5 & 100!");
			}
			
			while(guestNum < 5 || guestNum > 100);
				eventObjects[i].setGuests(guestNum);
			}
			
			for(int i = 0; i < SIZE; i++)
			{
				System.out.println("" + eventObjects[i].getEventNumber() 
						+ " Contact Number: " 
						+ eventObjects[i].getPhoneNumber());
				for(int j = 0; j < eventObjects[i].getGuestsCount(); j++);
			}

			//Method to sort based on user input.
			int cont = 1;
			while(cont != 0)
			{
				System.out.println("Sort Events By: \n1. Event Number\n." + "2. Number Of Guests\n3. Event Type\n");
				int choice=scanner.nextInt();
				if(choice == 1)
				{
					Arrays.sort(eventObjects,new Comparator<Event>()
					{
						public int compare(Event e1,Event e2)
						{
							return e1.getEventNum().compareTo(e2.getEventNum());	
						}
					});

			for(int i = 0; i < SIZE; i++)
			{
				for(int j = 0; j < eventObjects[i].getGuestsCount(); j++);
			}
				}

			else if(choice == 2)
			{
				Arrays.sort(eventObjects,new Comparator<Event>()
				{
					public int compare(Event e1,Event e2)
					{
						return e1.getGuestsCount()-e2.getGuestsCount();
					}
				});

			for(int i =  0; i < SIZE; i++)
			{
				System.out.println("" + eventObjects[i].getEventNumber() 
						+ " Contact Number: " + eventObjects[i].getPhoneNumber() 
						+ " Printing Message " + eventObjects[i].getGuestsCount() 
						+ " Times");
				for(int j = 0; j < eventObjects[i].getGuestsCount(); j++);
	
			}
			}

			else if(choice == 3)
			{
				Arrays.sort(eventObjects,new Comparator<Event>()
				{
					public int compare(Event e1,Event e2)
					{
						return e1.getEventType()-e2.getEventType();
					}
				});
			
			for(int i = 0; i < SIZE; i++)
			{
				System.out.println("" + eventObjects[i].getEventNumber() 
						+ " Contact Number: " + eventObjects[i].getPhoneNumber()
						+ " Printing message " + eventObjects[i].getGuestsCount() 
						+ " Times");
			for(int j = 0; j < eventObjects[i].getGuestsCount(); j++);
			}
			}
				
			System.out.println("Continue Sorting? (0 for NO, 1 for YES )\n");
			cont = scanner.nextInt();
			}
	}
}