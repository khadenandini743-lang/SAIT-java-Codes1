// 4. Bank Withdrawal Story
//A bank system stores customer account information. Create a class BankAccount with private variables:
//accountHolder
//balance
//withdrawAmount
//Using getter logic:
//If withdrawAmount ≤ balance
//then subtract it from balance. Otherwise print:
//Insufficient balance
//Display remaining balance. 
public class BankAccount {
	 private String accountHolder;
	    private double balance;
	    private double withdrawAmount;

	    public void setData(String n, double b, double w) {
	        accountHolder = n;
	        balance = b;
	        withdrawAmount = w;
	    }

	    public double getBalance() {
	        if (withdrawAmount <= balance)
	            balance -= withdrawAmount;
	        else
	            System.out.println("Insufficient Balance");

	        return balance;
	    }
	    public void display()
	    {
	        System.out.println("Account Holder = " + accountHolder);
	        System.out.println("Remaining Balance = " + getBalance());
	    }


	    public static void main(String[] args) {
	        BankAccount b = new BankAccount();
	        b.setData("Nandini", 10000, 3000);
	        b.display();

	    }
}
