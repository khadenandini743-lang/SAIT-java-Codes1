
public class Absolutevalue {

	    public static void main(String[] args) {

	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        int n = sc.nextInt();

	        if(n < 0)
	            n = -n;

	        System.out.println("Absolute Value = " + n);
	        sc.close();
	    }
}
