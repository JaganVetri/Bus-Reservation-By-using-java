package Busrev;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
   String Passenger;
   int Busno;
   Date date;
   
   Booking(){
	   //l.i
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the name of Passenger: ");
	   String PassengerName=s.nextLine();
	   int Busno=s.nextInt();
	   System.out.println("Enter the date dd-mm-yyyy");
	   String dateInput=s.next();
	   SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	   try {
		date =dateFormat.parse(dateInput);
	   }
	   catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public boolean isAvailable(ArrayList<Booking>booking,ArrayList<Bus>buses) {
	   int capacity=0;
	   for (Bus bus : buses) {
		if(bus.getBusno()==busNo) {
			capacity=bus.getCapacity();
		}
		int booked=0;
		for (Booking b : bookings) {
			if (b.busNo==busNo &&b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity>?true:false;
	}
   }
   
}
