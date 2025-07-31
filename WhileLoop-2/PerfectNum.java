import java.util.Scanner;
class PerfectNum
{
public static void checkPerfectNum()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter n ");
long n=sc.nextInt();
int i=1;
int factor=0;
while(i<=n/2)
{
if(n%i==0)
factor=factor+i;
i++;
}
if(factor==n)
System.out.println("The number " + n + " is a perfect number " );
else
System.out.println("The number " + n + " is not a perfect number " );
}
public static void main (String[] args)
{
checkPerfectNum();
}
}