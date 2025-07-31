import java.util.Scanner;
class check5{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter char: ");

char result=sc.next().charAt(0);
if(result>='A'&&result<='Z')
{
System.out.println("The result is in uppercase alphabet " + result);
}

else if(result>='a'&&result<='z')
{
System.out.println("The result is in lowercase alphabet " + result);
}

else if(result>='0'&&result<='9')
{
System.out.println("The result is in digit " + result);
}
else
System.out.println("The result is special char " + result);

}

}
