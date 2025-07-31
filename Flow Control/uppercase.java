import java.util.Scanner;
class uppercase{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter the char: ");
char alphabet=sc.next().charAt(0);

if(alphabet>='A' && alphabet<='Z')
{
System.out.println("The char is in uppercase " + alphabet);

}
else if(alphabet>='a' && alphabet<='z'){
System.out.println("The char is in lowercase " + alphabet);

}
else
System.out.println("The char is not a alphabet " + alphabet);
}
}