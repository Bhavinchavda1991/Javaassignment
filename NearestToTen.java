import java.util.Scanner;
public class NearestToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;

		


		   

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int first = scanner.nextInt();

		        System.out.print("Enter second number: ");
		        int second = scanner.nextInt();

		        if(Math.abs(first-10)<Math.abs(second-10)){
		            System.out.println(first+" is nearest to 10");
		        }else if(Math.abs(first-10)>Math.abs(second-10)){
		            System.out.println(second+" is nearest to 10");
		        }else{
		            System.out.println("Its a Tie");
		        }
		    }
		

	}


