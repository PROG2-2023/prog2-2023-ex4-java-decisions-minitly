package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
public class FlightBooking {
    
    
    


    String flightCompany;//1
    String flightID;//2
    String passengerFullName;//3
    String tripSource;//4
    String sourceAirport;//5
    String tripDestination;//6
    String destinationAirport;//7
    LocalDate departureDate;//8
    LocalDate returnDate;//9
    int childPassengers;//10
    int adultPassengers;//11
    int totalPassengers=childPassengers+adultPassengers;//12
    double departingTicketPrice;//13
    double returnTicketPrice;//14
    double totalTicketPrice=departingTicketPrice+returnTicketPrice;//15
    String ticketNumber;//16
    //String BookingClass;//17
    String TripType;//18
    
    enum TripSource
    {
            NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,  PARIS
    }
    enum TripDestination
    {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,  PARIS
    }
    enum SourceAirport
    {
        NANJINGLUKOUINTERNATIONNALAIRPORT,BEIJINGCAPITALINTERNATIONNALAIRPORT,SHANGHAIPUDONGINTERNATIONNALAIRPORT,
    OULUAIRPORT,HELSINKIAIRPORT,PARISCHARLESDEGAULLEAIRPORT,
    }

    enum DestinationAirport
    {
        NANJINGLUKOUINTERNATIONNALAIRPORT,BEIJINGCAPITALINTERNATIONNALAIRPORT,SHANGHAIPUDONGINTERNATIONNALAIRPORT,
    OULUAIRPORT,HELSINKIAIRPORT,PARISCHARLESDEGAULLEAIRPORT,
    }
    enum BookingClass
    {
            FIRST,BUSINESS,ECONOMY
    }





    //1
    public String getFlightCompany()
    {
        return flightCompany;
    }
    public void setFlightCompany(String flightCompany)
    {
        this.flightCompany=flightCompany;
    }
    //2
    public String getFlightID()
    {
        return flightID;
    }
    public void setFlightID(String flightID)
    {
        this.flightID=flightID;
    }
    //3
    public String getPassengerFullName()
    {
        return passengerFullName;
    }
    public void setPassengerFullName(String passengerFullName)
    {
        this.passengerFullName=passengerFullName;
    }
     //4
     public String getTripSource()
     {
         return tripSource;
     }
     public void setTripSource(String tripSource)
     {
        this.tripSource=tripSource;
     }
     //5 
     public String getSourceAirport()
     {
         return sourceAirport;
     }
     public void setSourceAirport(String sourceAirport)
     {
         this.sourceAirport=sourceAirport;
     }
     //6 
     public String getTripDestination()
     {
         return tripDestination;
     }
     public void  setTripDestination(String tripDestination)
     {
         this.tripDestination=tripDestination;
     }
     //7   destinationAirport
     public String getDestinationAirport()
     {
         return destinationAirport;
     }
     public void  setDestinationAirport(String destinationAirport)
     {
         this.destinationAirport=destinationAirport;
     }
     //8 departureDate
     public LocalDate getDepartingDate()
     {
         return departureDate;
     }
     public void setDepartingDate(String departureDate)
     {
        LocalDate depar=LocalDate.parse(departureDate);
         this.departureDate=depar;
     }
     //9 returnDate
     public LocalDate getReturnDate()
     {
         return returnDate;
     }
     public void setReturnDate(String returnDate)
     {
        LocalDate ret=LocalDate.parse(returnDate);
        this.returnDate=ret;
     }
 
     //10 
     public int getChildrenPassengers()
     {
         return childPassengers;
     }
     public void setChildrenPassengers(int childPassengers)
     {
         this.childPassengers=childPassengers;
     }
     //11
     public int getAdultPassengers()
     {
         return adultPassengers;
     }
     public void setAdultPassengers(int adultPassengers)
     {
         this.adultPassengers=adultPassengers;
     }
     //12 
     public int  getTotalPassengers()
     {
         return totalPassengers;
     }
     public void  setTotalPassengers(int childPassengers,int adultPassengers)
     {
         this.totalPassengers=childPassengers+adultPassengers;
     }
     //13 
     public double  getDepartingTicketPrice()
     {
         return departingTicketPrice;
     }
     public void  setDepartingTicketPrice(double departingTicketPrice)
     {
         this.departingTicketPrice=departingTicketPrice;
     }
      //14 
      public double  getReturnTicketPrice()
      {
          return returnTicketPrice;
      }
      public void  setReturnTicketPrice(double returnTicketPrice)
      {
          this.returnTicketPrice=returnTicketPrice;
      }
      //15  
      public double  getTotalTicketPrice()
      {
          return totalTicketPrice;
      }
      public void  setTotalTicketPrice(double departingTicketPrice,double returnTicketPrice)
      {
          this.totalTicketPrice=departingTicketPrice+returnTicketPrice;
      }
      //16  
      public String getTicketNumber()
      {
          return ticketNumber;
      }
      public void setTicketNumber(String ticketNumber)
      {
          this.ticketNumber=ticketNumber;
      }


      //  17   BookingClass
    //   public String getBookingClass()
    //   {
    //       return BookingClass;
    //   }
    //   public void setBookingClass(int num)
    //   {
    //     switch(num)
    //       {
    //       case 1:
    //       this.BookingClass="First";break;
    //       case 2:
    //       this.BookingClass="Business";break;
    //       case 3:
    //       this.BookingClass="Economy";break;
    //     }
    //   }
      // 18 TripType
      public String getTripType()
      {
          return TripType;
      }
      public void setTripType(int num)
      {
        switch(num)
          {
          case 1:
          this.TripType="One way";break;
          case 2:
          this.TripType="Return";break;
        }
      }




      public void show()
      {
        System.out.println("Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + sourceAirport + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice);
      }



}


