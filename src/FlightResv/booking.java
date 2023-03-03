package FlightResv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class booking {
String passengerName;
int FlightNo;
Date date;

booking(){
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter name of passenger:  ");
    passengerName = scanner.next();
    System.out.println("Enter Flight No:  ");
    FlightNo = scanner.nextInt();
    System.out.println("Enter date dd-mm-yyyy");
    String dateInput = scanner.next();
   SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
   try {
   date = dateformat.parse(dateInput);
   }catch (ParseException e) {
	   e.printStackTrace();
   }
}

public boolean isAvailable(ArrayList<booking> Bookings,ArrayList<Flight>flights) {
	int capacity = 0;
	for(Flight flight: flights) {
		if(flight. getFlightNo()== FlightNo)
			capacity = flight.getCapacity();
	}
	int booked = 0;
	for(booking b:booking) {
   if(b.FlightNo == FlightNo && b.date.equals(date)) {
	
	booked++;
	
}
	return booked<capacity?true:false;
}
}
}