/*
 * @author John B. Allen
 */

import java.util.Scanner;

// The Event class holds detail fields about the the event's at Carly's.
public class Event
{
	//Fields
	public static double highGuestPrice = 35.00;
	public static double lowGuestPrice = 32.00;
	public static final int MAX_LARGE_EVENT = 50;
	public final static int EVENT_NUM_LENGTH = 4;
	public String phoneNum = "";
	public String eventNum = "";
	public int guests;
	protected double pricePerEvent;
	private int eventType;
	private final String[] EVENT_TYPES = {"Wedding","Baptism","Birthday","Corporate","Other"};
	
	//String to identify formats for event number, guest count, phone number, event types/\.
	public Event(String string, int i, Object object) 
	{
		this("A000", 0, 0000000000, 4);
	}
	
	//Eclipse added this in due to an error, not sure what it means.
	public Event(String string, int i, int j, int k) 
	{
	}
	
	//Eclipse made me put this here to rid an error.
	public Event(String eventNum2, int numGuests) {
		// TODO Auto-generated constructor stub
	}

	//Set Method to set the event number.
	public void setEventNumber(String num)
	{
		boolean numOk = true;
		if(num.length() != EVENT_NUM_LENGTH 
				|| !Character.isLetter(num.charAt(0))
				|| !Character.isDigit(num.charAt(1))
				|| !Character.isDigit(num.charAt(2))
				|| !Character.isDigit(num.charAt(3)))
			eventNum = "A000";
		else
			eventNum = num.toUpperCase();		
	}

	//Get Method to get the event type.
	public int getEventType()
	{
		return this.eventType;   
	}

	//Get Method to get the event number.
	public String getEventNum() 
	{
		return eventNum;
	}
	
	//Get Method to get the event.
	public String getEvents()
	{
		return EVENT_TYPES[this.eventType];
	}
	
	//Get Method to get the ohine number.
	public String getPhoneNumber()
	{
		String ret = ("" + this.phoneNum.charAt(0)
			+ "" + this.phoneNum.charAt(1) + "" + this.phoneNum.charAt(2)
			+ "" + this.phoneNum.charAt(3) + "" + this.phoneNum.charAt(4)
			+ "" + this.phoneNum.charAt(5) + "" + this.phoneNum.charAt(6)
			+ "" + this.phoneNum.charAt(7) + "" + this.phoneNum.charAt(8)
			+ "" + this.phoneNum.charAt(9));
		return ret;
	}
	
	//Get Method to get the guest count.
	public int getGuestsCount()
	{
		return 0;
	}

	//Get Method to get the event number.
	public String getEventNumber()
	{
		String ret1 = "Event Number: " + this.eventNum;
			return ret1;
	}
	
	//Setter Methods
	public void setEventType(int eventType1)
	{
		if(eventType1 >= EVENT_TYPES.length)
		{	
			this.eventType = EVENT_TYPES.length - 1;
		}
	else
	{
		this.eventType = eventType1;
	}
	}	
	
	//Set Method to Set the event type.
	public void setEventNum(String eventNum) 
	{	
		this.eventNum = eventNum;
	}

	//Set Method to set the phone number.
	public void setPhoneNumber()
	{
		Scanner scanner = new Scanner(System.in);
			int count = 0;
		System.out.println("Enter Your 10-digit Phone Number: ");
		String phNum = scanner.nextLine();
			int len = phNum.length();
			for(int i=0; i < count; i++)
			{
				char c = phNum.charAt(i);
					if(Character.isDigit(c))
			{
				count++;
				String ss = Character.toString(c);
				phoneNum = phoneNum.concat(ss);
		}
	}

	if(count!=10)
	{
		phoneNum = "" ;
		phoneNum = phoneNum.concat("Invalid");	
	}
	}

	//Set Method to set the guest count to determine price.
	public void setGuests(int guests)
	{
		this.guests = guests;
			if(isLargeEvent())
				setPricePerEvent(highGuestPrice);
			else
				setPricePerEvent(lowGuestPrice);
	}

	//Boolean to determine if the event is larger than 50 guests.
	public boolean isLargeEvent()
	{
		if(guests >= MAX_LARGE_EVENT)
		{
			return true;
		}
		
	else if(guests < MAX_LARGE_EVENT)
	{
		return false;
	}

	return isLargeEvent();
	}

	public double getPricePerEvent() {
		return pricePerEvent;
	}

	public void setPricePerEvent(double pricePerEvent) {
		this.pricePerEvent = pricePerEvent;
	}
}	