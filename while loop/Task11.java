import java.util.Scanner;
class Task11
{ 
public static void checkPrimeNum()
{ 
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
int count=0;
int i=2;
while(i<=n/2)
{
if(n%i==0)
{
count++;
}
i++;
}
if(count==0)
System.out.println(n + " is a prime number");
else
System.out.println(n + " is not a prime number");
}
public static void main(String[] args)
{
checkPrimeNum();
}
}