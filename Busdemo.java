package Busrev;
import java.util.*;
import java.util.ArrayList;
public class Busdemo {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList <Bus> buses=new ArrayList<Bus>();
		ArrayList <Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1 ,true ,2));
		buses.add(new Bus(2 ,false ,3));
		buses.add(new Bus(3 ,true ,4));
		
		for (Bus bus : buses) {
			bus.displayBusInfo();
		}
		
		int useroutput=1;
		while (useroutput==1) {
			System.out.println("Enter the 1 Book and 2 to Exit");
			useroutput=s.nextInt();
			if (useroutput==1) {
				Booking booking=new Booking();
				if (booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else {
					System.out.println("Sorry,Bus is full.Try another bus or date");
				}
			}
		}
	}

}
