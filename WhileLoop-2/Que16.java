class Que16
{
public static void Series()
{
double n=1.0;
int k=1;
double sum=0;
while(k<=100)
{
sum=sum+(n/(k*k));
k++;
}
System.out.println("sum of series " + sum);
}
public static void main(String[] args)
{
Series();
}
}