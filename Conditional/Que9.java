import java.util.Scanner;
class Que9
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int x=sc.nextInt();
System.out.println(x>=100 && x<=999 || x>=-100 && x<=-999?"The number is 3 digit number": "The number is not three digit number");
}
}