import java.util.Scanner;
class Que11
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x :");
int x=sc.nextInt();
System.out.println("Enter the value of y :");
int y=sc.nextInt();
System.out.println(x%y==0?"Y is a factor of X":"Y is not a factor of X" );
}
}