import java.util.Scanner;
class Que14
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char x= sc.next().charAt(0);
System.out.println(x >= 'a' && x <= 'z' ? "The Char is an LowerCase.":"The Char is not in LowerCase.");

}
}