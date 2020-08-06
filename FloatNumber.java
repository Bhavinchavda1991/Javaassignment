
import java.util.*;

public class FloatNumber
{
   public static void main(String[] args)
   {
   Scanner sc = new Scanner(System.in);
  
   //variable declaration
   double num;
  
   //get user input
       System.out.println("Enter a floating point number: ");
       num = sc.nextFloat();
      
       //check if input number is zero
       if(num == 0)
       System.out.println("zero");
      
       //check if input number is greater than zero
       else if(num>0)
       System.out.println("positive");
       else
       System.out.println("negative");
      
       //check if absolute value of number is less than 1
       if(Math.abs(num) < 1)
       System.out.println("small");
      
       //check if absolute value of number is greater than 1000000   
       if(Math.abs(num) > 1000000)
       System.out.println("large");
   }
}