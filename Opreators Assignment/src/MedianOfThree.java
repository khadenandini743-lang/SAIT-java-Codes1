//10. Find the Median of Three Integers Using Ternary Operator Only
public class MedianOfThree {

	    public static void main(String[] args) {
	    	java.util.Scanner sc=new java.util.Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        System.out.print("Enter third number: ");
	        int c = sc.nextInt();

	        int median = (a > b)
	                ? ((b > c) ? b : (a > c ? c : a))
	                : ((a > c) ? a : (b > c ? c : b));

	        System.out.println("Median = " + median);
	    }
}
