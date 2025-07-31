import java.util.Scanner;
class Task10
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
System.out.println("Factors are: " +n);
count++;
} 
n++;
} 
System.out.println("Total Factors are: " + count);
} 
public static void main(String[] args)
{
printFactor();
} 
}