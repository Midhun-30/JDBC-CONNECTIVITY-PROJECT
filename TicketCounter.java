package thread_demo;

public class TicketCounter {
	
	private int availableSeats=3;
	
	public synchronized void bookTicket(String pname,int numberOfSeats){
		
		if((availableSeats >=numberOfSeats) && (numberOfSeats > 0)){
			
			System.out.println("Hi "+pname+" : "+numberOfSeats+" Seat booked success....");
			availableSeats=availableSeats-numberOfSeats;
			
		} else {
		System.out.println("Hi "+pname+" : Seats Not Available ..");
		}
		
	}

}
