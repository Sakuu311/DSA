import java.util.Scanner;
class Count
{
public static int getCount(long n)
{
int count=0;
while(n>0)
{
long rem=n%10;
count++;
n/=10;
}
return count;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n ");
long n=sc.nextLong();
long result=getCount(n);
System.out.println("Count " + result);
}
}