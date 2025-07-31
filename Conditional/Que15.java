import java.util.Scanner;
class Que15
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter The Character:");
char x= sc.next().charAt(0);

System.out.println(x>='A' && x<= 'Z' || x>= 'a' && x<= 'z'? "The Char is an alphabet.": "The char is not an alphabet");



}





}