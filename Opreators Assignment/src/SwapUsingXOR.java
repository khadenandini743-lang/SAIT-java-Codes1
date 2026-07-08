//12. Swap Two Numbers Without Using a Temp Variable (Using XOR) logic
public class SwapUsingXOR {
    public static void main(String[] args) {
    	java.util.Scanner sc=new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        sc.close();
    }

}
