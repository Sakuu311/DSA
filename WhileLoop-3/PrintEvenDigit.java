import java.util.Scanner;
class PrintEvenDigit
{
public static void EvenPrint(long n)
{
while(n>0)
{
long rem=n%10;
if(n%2==0)
System.out.println(rem);
n/=10;
}
}
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  n: ");
long n=sc.nextLong();
EvenPrint(n);
}
}