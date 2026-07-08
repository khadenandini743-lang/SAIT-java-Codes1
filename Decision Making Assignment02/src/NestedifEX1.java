
public class NestedifEX1 {
	
	    public static void main(String[] args) {

	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();

	        if(a > b) {
	            if(a > c) {
	                if(a > d)
	                    System.out.println("Greatest = " + a);
	                else
	                    System.out.println("Greatest = " + d);
	            } else {
	                if(c > d)
	                    System.out.println("Greatest = " + c);
	                else
	                    System.out.println("Greatest = " + d);
	            }
	        } else {
	            if(b > c) {
	                if(b > d)
	                    System.out.println("Greatest = " + b);
	                else
	                    System.out.println("Greatest = " + d);
	            } else {
	                if(c > d)
	                    System.out.println("Greatest = " + c);
	                else
	                    System.out.println("Greatest = " + d);
	            }
	            sc.close();
	        }
	    }
	}

