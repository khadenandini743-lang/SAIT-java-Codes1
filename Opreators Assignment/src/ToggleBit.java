
public class ToggleBit {
	 public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.print("Enter a number: ");
     int num = sc.nextInt();

     int bitPosition = 2; // 3rd bit (0-based indexing)

     int result = num ^ (1 << bitPosition);

     System.out.println("Original Number = " + num);
     System.out.println("After Toggling 3rd Bit = " + result);

     sc.close();
  }
}
