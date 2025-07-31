import java.util.Scanner;
class Task9
{ 
public static void printFactor()
{ 
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
int n=1;
int count=0;
while(n<num)
{ 
if(num%n==0)
{ 
count++;
} 
n++;
} 
System.out.println(count);
} 
public static void main(String[] args)
{
printFactor();
} 
}