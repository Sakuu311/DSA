class Que4b
{
public static void main(String[] args)

{

int a=10;
int b=20;
int c=30;
System.out.println(a=a+b+c); //60
System.out.println(b=a-(c+b)); //b=10
System.out.println(c=a-(c+b)); //c=20
System.out.println(a=a-(c+b)); //a=30

}
}