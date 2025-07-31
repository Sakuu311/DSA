import java.util.Scanner;
class Que13
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char x= sc.next().charAt(0);
System.out.println(x >= 'A' && x <= 'Z' ? "The Char is an UpperCase.":"The Char is not in UpperCase.");

}
}