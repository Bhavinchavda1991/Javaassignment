package Task4Array;
import java.util.*;

class FoundDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a character: ");
char ch=sc.next().charAt(0);
if(ch=='r' || ch=='R' || ch=='a' || ch=='A' || ch=='n' || ch=='N' ||ch=='d' || ch=='D' || ch=='o' || ch=='O' || ch=='m' || ch=='M')
{
System.out.println("Found");
}
else
{
System.out.println("Not Found");
}
}
}
