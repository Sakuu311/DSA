import java.util.Scanner;
class Factor
{
public static long getSumOfFactor(long n)
{
int i=1;
int factor=0;
while(i<=n/2)
{
if(n%i==0)
{
factor=factor+i;
}
i++;
}

return factor;
}
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter n ");
long n=sc.nextInt();
long result = getSumOfFactor(n);
System.out.println("Sum of n " + result);
}
}