
public class Nestedif {
	 public static void main(String[] args) {
		 java.util.Scanner sc=new java.util.Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();

	        if(a > b) {
	            if(a > c)
	                System.out.println("Greatest = " + a);
	            else
	                System.out.println("Greatest = " + c);
	        } else {
	            if(b > c)
	                System.out.println("Greatest = " + b);
	            else
	                System.out.println("Greatest = " + c);
	        }

	        sc.close();
	    }
}
