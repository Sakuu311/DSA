import java.util.Scanner;
class SumOfDigit
{
public static long getSumOfDigit(long n)
{
long sum=0;
while(n>0)
{
long rem=n%10;
sum=sum+rem;
n/=10;
}
return sum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n ");
long n=sc.nextLong();
long result=getSumOfDigit(n);
System.out.println("Sum " + result);
}
}