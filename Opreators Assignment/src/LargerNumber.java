//7.Given Two Integers, Return the Larger One Using Conditional Operator
public class LargerNumber {
	 public static void main(String[] args) {
		 java.util.Scanner sc=new java.util.Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        int larger = (a > b) ? a : b;

	        System.out.println("Larger number = " + larger);
	    }
}
