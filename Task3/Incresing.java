package Task3;
import java.util.Scanner;
public class Incresing {
	
	
	   public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input first number: ");
	        double x = in.nextDouble();
	        System.out.print("Input second number: ");
	        double y = in.nextDouble();
	       System.out.print("Input third number: ");
	        double z = in.nextDouble();
	        if (x < y && y < z)
	        {
	            System.out.println("Increasing ");
	        }
	        else if (x > y && y > z)
	        {
	            System.out.println("Decreasing order");
	        }
	        else
	        {
	            System.out.println("Neither increasing or decreasing order");
	        }
	    }
	}