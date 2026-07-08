
public class UpperLowerCase {
	 public static void main(String[] args) {

	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        char ch = sc.next().charAt(0);

	        if(ch >= 'A' && ch <= 'Z')
	            System.out.println("Uppercase");
	        else if(ch >= 'a' && ch <= 'z')
	            System.out.println("Lowercase");
	        else
	            System.out.println("Not an Alphabet");
	        sc.close();
	    }
}
