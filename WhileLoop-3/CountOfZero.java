import java.util.Scanner;
class CountOfZero
{
public static int getCountOfZero(long n)
{
int count=0;
int zero=0;
while(n>0)
{
long rem=n%10;
if(rem==zero)
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
long result=getCountOfZero(n);
System.out.println("Count " + result);
}
}