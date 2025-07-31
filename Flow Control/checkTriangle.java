import java.util.Scanner;
class checkTriangle{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter side a : ");
int num1=sc.nextInt();
System.out.println("The side a = " + num1);

System.out.println("Enter side b : ");
int num2=sc.nextInt();
System.out.println("The side b = " + num2);

System.out.println("Enter side c : ");
int num3=sc.nextInt();
System.out.println("The side c = " + num3);

if((num1+num2)>num3 && (num2+num3)>num1 && (num3+num1)>num2)
{
System.out.println("The triangle is a valid triangle");

if(num1==num2 && num2==num3){
System.out.println("The triangle is a equilateral triangle");

}else if(num1==num2 || num2==num3 || num3==num1){
System.out.println("The triangle is a Isosceles triangle");
}
else if(num1!=num2 && num2!=num3){
System.out.println("The triangle is a Scalene triangle");

}
}
else
System.out.println("The triangle is not a valid triangle");
}
}



