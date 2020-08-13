package Task6ClassObject;


	import java.util.Scanner;

	public class ComplexNumber {

	   public static void main(String[] args) {
	       // Scanner to get user input
	       Scanner in = new Scanner(System.in);

	       // Get first complex number
	       System.out.print("Enter the first complex number's real part => ");
	       double a = in.nextDouble();
	       System.out.print("Enter the first complex number's imaginary part => ");
	       double b = in.nextDouble();

	       // Create ComplexNumber from a and b
	       ComplexNumber c1 = new ComplexNumber();

	       // Get second complex number
	       System.out.print("Enter the second complex number's real part => ");
	       a = in.nextDouble();
	       System.out.print("Enter the second complex number's imaginary part => ");
	       b = in.nextDouble();

	       // Create ComplexNumber from a and b
	       ComplexNumber c2 = new ComplexNumber();

	       // Print c1 and c2
	       System.out.print("\ncomplex number 1: " + c1);
	       System.out.print("\ncomplex number 2: " + c2);

	       // Check whether c1 and c2 are equal
	       System.out.print("\nthe numbers are equal? " + c1.equals(c2));

	       // Add c1 and c2
	       System.out.print("\nadd result: " + c1.add(c2));

	       // Subtract c2 from c1
	       System.out.print("\nsubtract result: " + c1.subtract(c2));

	       // Multiply c1 and c2
	       System.out.print("\nmultiply result: " + c1.multiply(c2));

	       // Divide c1 by c2
	       try{
	       System.out.print("\ndivide result: " + c1.divide(c2));
	       } catch(Exception e) {
	           System.out.print("\n" + e.getMessage());
	       }
	   }

	private String add(ComplexNumber c2) {
		// TODO Auto-generated method stub
		return null;
	}

	private String subtract(ComplexNumber c2) {
		// TODO Auto-generated method stub
		return null;
	}

	private String multiply(ComplexNumber c2) {
		// TODO Auto-generated method stub
		return null;
	}

	private String divide(ComplexNumber c2) {
		// TODO Auto-generated method stub
		return null;
	}
}

	


