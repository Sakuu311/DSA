import java.util.Scanner;
class Factorial
{

public static int getFactorial(int n)
{
int fact=1;
int i=1;
while(i<=n)
{
fact=fact*i;
i++;
}
return fact;
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
int n=sc.nextInt();
int result=getFactorial(n);
System.out.println("Factorial of " + n + "! is " + result );
}
}