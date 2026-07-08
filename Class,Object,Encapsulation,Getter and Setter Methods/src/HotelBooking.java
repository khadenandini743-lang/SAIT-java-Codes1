
public class HotelBooking {
	 private String guestName;
	    private double roomPricePerNight;
	    private int numberOfNights;

	    public void setData(String g, double r, int n)
	    {
	        guestName = g;
	        roomPricePerNight = r;
	        numberOfNights = n;
	    }

	    public double getBill()
	    {
	        double bill;

	        bill = roomPricePerNight * numberOfNights;

	        if(numberOfNights >= 7)
	        {
	            bill = bill - (bill * 15 / 100);
	        }

	        return bill;
	    }

	    public void display()
	    {
	        System.out.println("Guest Name = " + guestName);
	        System.out.println("Final Bill = " + getBill());
	    }

	    public static void main(String args[])
	    {
	        HotelBooking h = new HotelBooking();

	        h.setData("Nandini", 2000, 8);

	        h.display();
	    }
	
}
