// 9. Library Fine System
//A library charges fine for late book return. Create a class LibraryBook with private variables:
//
//bookName
//daysLate
//finePerDay
//Using getters calculate:
//totalFine = daysLate × finePerDay
//If daysLate > 10 add extra ₹100 penalty. Display total fine. 
public class LibraryBook {
	 private String bookName;
	    private int daysLate;
	    private double finePerDay;

	    public void setData(String b, int d, double f)
	    {
	        bookName = b;
	        daysLate = d;
	        finePerDay = f;
	    }

	    public double getFine()
	    {
	        double totalFine;

	        totalFine = daysLate * finePerDay;

	        if(daysLate > 10)
	        {
	            totalFine = totalFine + 100;
	        }

	        return totalFine;
	    }

	    public void display()
	    {
	        System.out.println("Book Name = " + bookName);
	        System.out.println("Total Fine = " + getFine());
	    }

	    public static void main(String args[])
	    {
	        LibraryBook lb = new LibraryBook();

	        lb.setData("Java Programming", 12, 20);

	        lb.display();
	    }
}
