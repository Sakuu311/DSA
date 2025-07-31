import java.util.Scanner;
class alphabet{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter the char: ");
char alphabet=sc.next().charAt(0);
if(alphabet >= 'a' && alphabet <= 'z' || alphabet >= 'A' && alphabet <= 'Z'){

System.out.println("The char is alphabet");
}
else
{
System.out.println("The char is not a alphabet");
}
}

}