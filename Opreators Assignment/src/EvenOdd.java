//6.Find if a Number is Even or Odd Using Conditional (Ternary) Operator
public class EvenOdd {
    public static void main(String[] args) {
    	java.util.Scanner sc=new java.util.Scanner(System.in);
		

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number is " + result);
    }

}
