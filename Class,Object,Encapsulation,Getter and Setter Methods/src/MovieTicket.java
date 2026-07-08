// 3. Movie Ticket Booking
//A cinema hall stores ticket booking information. Create a class MovieTicket with private variables:
//movieName
//ticketPrice
//numberOfTickets
//Using getters calculate total cost.
//If tickets ≥ 5 give 5% discount.
//
//Print movie name and total price. 
public class MovieTicket {
	 private String movieName;
	    private double ticketPrice;
	    private int numberOfTickets;

	    public void setData(String m, double p, int n)
	    {
	        movieName = m;
	        ticketPrice = p;
	        numberOfTickets = n;
	    }

	    public double getTotal()
	    {
	        double total;

	        total = ticketPrice * numberOfTickets;

	        if(numberOfTickets >= 5)
	        {
	            total = total - (total * 5 / 100);
	        }

	        return total;
	    }

	    public void display()
	    {
	        System.out.println("Movie Name = " + movieName);
	        System.out.println("Total Price = " + getTotal());
	    }

	    public static void main(String args[])
	    {
	        MovieTicket t = new MovieTicket();

	        t.setData("Pushpa 2", 200, 5);

	        t.display();
	    }
}
