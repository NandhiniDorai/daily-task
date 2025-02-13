import java.util.Scanner;
public class PrimeEx
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter an integer:");
int a=sc.nextInt();
if(a/2==0)
{
System.out.print(a+"is not a prime");
}
else
{
System.out.print(a+"is a prime");
}
}
}
