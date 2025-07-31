class Que18
{
public static void Series()
{
double n=1.0;
int i=1;
int j=2;
double sum=0;
while(i<=100)
{
sum=sum+(n/(i*j));
i++;
j++;
}
System.out.println("sum of series " + sum);
}
public static void main(String[] args)
{
Series();
}
}