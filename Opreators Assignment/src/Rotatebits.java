//13. Rotate bits left
public class Rotatebits {
	 public static void main(String[] args) {
			java.util.Scanner sc=new java.util.Scanner(System.in);

	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        System.out.print("Enter rotation count: ");
	        int n = sc.nextInt();

	        int result = (num << n) | (num >>> (32 - n));

	        System.out.println("Left Rotated Value = " + result);

	        sc.close();
	    }
}
