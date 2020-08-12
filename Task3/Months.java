package Task3;

import java.util.Scanner;

public class Months {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter month number");
       int m = sc.nextInt();
       int days = getDays(m);
       String arr[] = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
               "October", "November", "December" };
       if(days==-1){
           System.out.println("Invalid entry. There are only 12 months.");
       }
       else{
           System.out.println(arr[m]+" has "+days+" days");
       }
      
   }

   private static int getDays(int mm) {
       int res = -1;
       switch (mm) {
       case 1:
           res = 31;
           break;
       case 2:
               res = 28;
           break;
       case 3:
           res = 31;
           break;
       case 4:
           res = 30;
           break;
       case 5:
           res = 31;
           break;
       case 6:
           res = 30;
           break;
       case 7:
           res = 31;
           break;
       case 8:
           res = 31;
           break;
       case 9:
           res = 30;
           break;
       case 10:
           res = 31;
           break;
       case 11:
           res = 30;
           break;
       case 12:
           res = 31;
           break;

       }
       return res;
   }

  

}


