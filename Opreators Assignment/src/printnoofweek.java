//Print the no. of week and remaining days from total no. of days.
public class printnoofweek {
	    public static void main(String[] args) {
	    	java.util.Scanner sc=new java.util.Scanner(System.in);
			

	        System.out.print("Enter total number of days: ");
	        int totalDays = sc.nextInt();

	        int weeks = totalDays / 7;
	        int remainingDays = totalDays % 7;

	        System.out.println("Weeks = " + weeks);
	        System.out.println("Remaining Days = " + remainingDays);

	        sc.close();
	    }

}
