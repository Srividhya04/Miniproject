package FlightResv;
import java.util.Scanner;
import java.util.ArrayList;
public class FlightDemo{

	public static void main(String[] args) {
		
		ArrayList<Flight> Flights = new ArrayList<Flight>();
		ArrayList<booking> bookings= new ArrayList<booking>();
		
		Flights.add(new Flight(1,true,2));
		Flights.add(new Flight(2,true,40));
		Flights.add(new Flight(3,false,50));

	  int userOpt=1;
	   Scanner scanner = new Scanner(System.in);
	   for (Flight b:Flights) {
		   b.displayFlightInfo();
	   }
		while(userOpt==1) {
     System.out.println("Enter 1 to Book and 2 to Exit");
     userOpt = scanner .nextInt();
     if(userOpt==1) {
    booking Booking = new booking();
    if(booking.isAvailable(Booking ,flight)) {
    	bookings.add(Booking);
    	System.out.println("Your booking is confirmed");
    }
    else
    	System.out.println("Sorry.Flight is full. Try another Flight or date.");
    }
	}
		}
	}		
