import java.util.Scanner;
class PrintDigit
{
public static void getPrint(long n)
{
while(n>0)
{
long rem=n%10;
System.out.println(rem);
n/=10;
}
}
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  n: ");
long n=sc.nextLong();
getPrint(n);
}
}