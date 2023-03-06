package prog2.exercise4.flight.booking.system;

/**
 * Hello world!
 *
 */
import java.time.LocalDate;
import java.util.Scanner;

import prog2.exercise4.flight.booking.system.FlightBooking.TripSource;
public class Main 
{
    public static void main( String[] args )
    {
        Scanner scanner =new Scanner(System.in);
        FlightBooking c=new FlightBooking();

        c.setFlightCompany("Flights-of-Fancy");

        c.setFlightID("FOF0345IN");

        System.out.print("input your full name:>");
        c.setPassengerFullName(scanner.nextLine());
        
        c.setTripSource("NANJING");

        c.setSourceAirport("NANJING LUKOU INTERNATIONAL AIRPORT");

        c.setTripDestination("OULU");

        c.setDestinationAirport("OULU AIRPORT");

        System.out.print("input your departing date:>");
        c.setDepartingDate(scanner.next());

        System.out.print("input your return date:>");
        c.setReturnDate(scanner.next());

        System.out.print("input your childticket number:>");
        c.setChildrenPassengers(scanner.nextInt());

        System.out.print("input your adultticket number:>");
        c.setAdultPassengers(scanner.nextInt());

        c.setTotalPassengers(c.getChildrenPassengers(),c.getAdultPassengers());

        //System.out.print("1.First\n2.Business\n3.Economy\n");
        //System.out.print("choose the class:>");
        //c.setBookingClass(scanner.nextInt());

        System.out.print("1.One way\n2.Return");
        System.out.print("choose the class:>");
        c.setTripType(scanner.nextInt());

        c.setDepartingTicketPrice(20);
        c.setReturnTicketPrice(200);
        c.setTotalTicketPrice(c.getDepartingTicketPrice(), c.getReturnTicketPrice());
        
        c.setTicketNumber("1234567");
        
        c.show();
       
        
    }
}
