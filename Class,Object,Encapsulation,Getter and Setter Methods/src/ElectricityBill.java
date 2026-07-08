// 2. Electricity Bill System
//An electricity company calculates monthly bills. Create a class ElectricityBill with private variables:
//customerName
//unitsConsumed
//pricePerUnit
//Using getters calculate total bill:
//totalBill = unitsConsumed * pricePerUnit
//If units > 500 add 10% surcharge.display the final bill.
public class ElectricityBill {
	  private String customerName;
	    private int unitsConsumed;
	    private double pricePerUnit;

	    public void setData(String n, int u, double p) {
	        customerName = n;
	        unitsConsumed = u;
	        pricePerUnit = p;
	    }

	    public double getBill() {
	        double bill;
	        bill = unitsConsumed * pricePerUnit;

	        if (unitsConsumed > 500)
	        {
	            bill += bill * 10/100;
	        }
	        return bill;
	    }
	    public void display()
	    {
	        System.out.println("Customer Name = " + customerName);
	        System.out.println("Final Bill = " + getBill());
	    }

	    public static void main(String[] args) {
	        ElectricityBill e = new ElectricityBill();
	        e.setData("Ram", 600, 8);
	       e.display();
	    }
}
