import java.util.Scanner;
class PrintDifference
{
public static void DifferenceOfNum(long n)
{
long big=n%10;
long small=n%10;
while(n>0)
{
long rem=n%10;
if(rem>big)
big=rem;
if(rem<small)
small=rem;
n/=10;
}
System.out.println("Biggest " + big);
System.out.println("Smallest " + small);

long result=big-small;
System.out.println("Difference " + result);
}
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  n: ");
long n=sc.nextLong();
DifferenceOfNum(n);
}
}