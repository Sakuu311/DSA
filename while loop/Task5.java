class Task5
{
public static void printDiv()
{
int n=1;
int count=0;
while(n<=100)
{
if(n%7==0){
System.out.println("N: " + n);
}
n++;
count++;
}
System.out.println("Count: " + count);
}
public static void main (String[] args)
{
printDiv();
}
}
