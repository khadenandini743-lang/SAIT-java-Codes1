
public class Greatestonumbers {
	 public static void main(String[] args) {
		 java.util.Scanner sc=new java.util.Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        if(a > b)
	            System.out.println("Greatest = " + a);
	        else
	            System.out.println("Greatest = " + b);

	        sc.close();
	    }
}
