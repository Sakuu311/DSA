class Taskk7
{
public static void printDiv()
{
int n=1;
int count=0;
while(n<=1000)
{
if(n%7==0 && n%10==7){
System.out.println("N: " + n);
count++;
}
n++;
}
System.out.println("Count: " + count);
}
public static void main (String[] args)
{
printDiv();
}
}
