import java.util.Scanner;
class Que10
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int x=sc.nextInt();
System.out.println(x%5==0 && x%11==0?"The number is divisible by both" : "The number is not divisible by both");
}
}
