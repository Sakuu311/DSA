import java.util.Scanner;
class PrintBiggest
{
public static void BiggestNum(long n)
{
long big=n%10;
while(n>0)
{
long rem=n%10;
if(rem>big)
big=rem;
n/=10;
}
System.out.println("Biggest " + big);
}
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  n: ");
long n=sc.nextLong();
BiggestNum(n);
}
}