//11.Find if a Number is Even or Odd Using Bit Logic

public class EvenOddBitwise {
	 public static void main(String[] args) {
		 java.util.Scanner sc=new java.util.Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if ((num & 1) == 0)
	            System.out.println("Even");
	        else
	            System.out.println("Odd");

	        sc.close();
	    }
}
