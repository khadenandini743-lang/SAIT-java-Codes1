//8. WAP to Find the Absolute Value of a Number Using Ternary Operator
public class Absolutevalue {
	
	    public static void main(String[] args) {
	    	 java.util.Scanner sc=new java.util.Scanner(System.in);


	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int abs = (num < 0) ? -num : num;

	        System.out.println("Absolute Value = " + abs);
	    }
}
