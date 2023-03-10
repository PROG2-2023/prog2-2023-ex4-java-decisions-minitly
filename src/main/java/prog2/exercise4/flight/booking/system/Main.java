package prog2.exercise4.flight.booking.system;



public class Main 
{
    public static void main( String[] args )
    {
        FlightBooking fb = new FlightBooking(null, null, null, 0, 0);
        
        FlightBooking.TripSource source = FlightBooking.TripSource.NANJING;
        FlightBooking.TripDestination destination = FlightBooking.TripDestination.BEIJING;

        FlightBooking.TripType type = FlightBooking.TripType.RETURN;

        FlightBooking.BookingClass bookClass = FlightBooking.BookingClass.FIRST;

        int child = 2;
        int adults = 5;
        fb.setTripSource("1");
        fb.setTripDestination("1", "2");

        fb.setTripType("2");
        fb.setBookingClass("1");

        fb.setDepartingTicketPrice(child, adults);
        fb.setReturnTicketPrice();

        fb.setTotalTicketPrice();

        double returnedPrice = Math.abs(fb.getTotalTicketPrice());
        double expectedPrice = Math.abs((((child *((300 + (0.1*300)) + (0.05*300))) + (adults*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);
        System.out.println(returnedPrice);
        System.out.println(expectedPrice);
        
    }
}
