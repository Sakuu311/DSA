import java.util.Scanner;
class Task12
{ 
public static void checkFib()
{ 
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
int n1=0;
int n2=1;
int i=1;
System.out.print(n1 + " " + n2 + " ");
while(i<=n-1)
{
int sum=n1+n2;
System.out.print(sum + " ");
n1=n2;
n2=sum;
i++;
}
}
public static void main(String[] args)
{
checkFib();
}
}