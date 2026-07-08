//9. Print "Positive", "Negative" or "Zero" Using Nested Ternary Operator
public class PositiveNegativeZero {
	
	    public static void main(String[] args) {
	    	java.util.Scanner sc=new java.util.Scanner(System.in);


	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        String result = (num > 0) ? "Positive"
	                        : (num < 0) ? "Negative"
	                        : "Zero";

	        System.out.println(result);
	    }
}
