import java.util.Scanner;
class Power
{
public static long getPower(long a,long b)
{
long power=1;
int i=1;
while(i<=b)
{
power=power*a;
i++;
}
return power;

}
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a ");
long a=sc.nextInt();
System.out.println("enter b ");
long b= sc.nextInt();
long result = getPower(a,b);
System.out.println("Power of a " + result);

}



}