
import java.util.*;
public class OddEven
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int number;
      
       //Invoke the user to enter a number
       System.out.print("Enter a number: ");
       number=sc.nextInt();
      
       //If the number is odd
       if(number%2!=0)
       {
           //print NEW
           System.out.println("NEW");
       }
       //if the number is even
       else
       {
           //ranges from 2 to 5
           if(number>=2 && number<=5)
           {
               //print OLd
               System.out.println("OLD");
           }
           //ranges from 6 to 30
           else if(number>=6 && number<=30)
           {
               //print NEW
               System.out.println("NEW");
           }
           //greater than 30
           else
           {
               //print OLD
               System.out.println("OLD");
           }
       }
       sc.close();
   }
}