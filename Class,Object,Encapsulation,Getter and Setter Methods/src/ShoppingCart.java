// 5. Online Shopping Cart
//An e-commerce website stores product purchase details. Create a class ShoppingCart with private variables:
//productName
//price
//quantity
//Using getters calculate total cost.
//If total > 5000 give 10% discount. Print final payable amount.
public class ShoppingCart {
	 private String productName;
	    private double price;
	    private int quantity;

	    public void setData(String p, double pr, int q)
	    {
	        productName = p;
	        price = pr;
	        quantity = q;
	    }

	    public double getTotal()
	    {
	        double total;

	        total = price * quantity;

	        if(total > 5000)
	        {
	            total = total - (total * 10 / 100);
	        }

	        return total;
	    }

	    public void display()
	    {
	        System.out.println("Product Name = " + productName);
	        System.out.println("Final Amount = " + getTotal());
	    }

	    public static void main(String args[])
	    {
	        ShoppingCart s = new ShoppingCart();

	        s.setData("Laptop Bag", 1500, 4);

	        s.display();
	    }
}
