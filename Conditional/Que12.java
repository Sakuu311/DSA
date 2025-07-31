import java.util.Scanner;
class Que12
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter side a:");
int a=sc.nextInt();

System.out.println("Enter side b:");
int b=sc.nextInt();

System.out.println("Enter side c:");
int c=sc.nextInt();

System.out.println(a+b>c && b+c>a && a+c>b ? "Valid Triangle" : "Invalid Triangle");


}


}