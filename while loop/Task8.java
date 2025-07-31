import java.util.Scanner;
class Task8{

public static void printFactor(){

Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
int n=1;
while(n<=num)
{
if(num%n==0)
{
System.out.println("n:" +n);
}
n++;
}
}
public static void main (String[] args)
{
 printFactor();

}

}