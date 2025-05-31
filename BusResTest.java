package thread_demo;

public class BusResTest {

	public static void main(String[] args) {

		
		TicketCounter tc=new TicketCounter();
		
		TicketBookingThread t1=new TicketBookingThread(tc,"raj",3);
		TicketBookingThread t2=new TicketBookingThread(tc,"John",1);
		TicketBookingThread t3=new TicketBookingThread(tc,"Ram",2);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
