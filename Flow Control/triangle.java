import java.util.Scanner;
class triangle{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter num1: ");

int num1=sc.nextInt();
System.out.println("The num1= " + num1);

System.out.println("Enter num2: ");

int num2=sc.nextInt();
System.out.println("The num2= " + num2);

System.out.println("Enter num3: ");

int num3=sc.nextInt();
System.out.println("The num3= " + num3);

if((num1+num2)>num3 && (num2+num3)>num1 && (num3+num1)>num2)
{
System.out.println("The triangle is a valid triangle");
}else
System.out.println("The triangle is not valid triangle");
}
}

