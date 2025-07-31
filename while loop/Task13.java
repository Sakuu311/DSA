import java.util.Scanner;
class Task13
{ 
public static int getFib()
{ 
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
if (n==0)
return 0;
int i=1;
int n0=0;
int n1=1;
int n2=1;
while(i<=n-1)
{
n2=n0+n1;
n0=n1;
n1=n2;
i++;
}
return n2;
}
public static void main(String[] args)
{
System.out.println(getFib());
}
}