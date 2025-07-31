class Que14
{
public static void Series()
{
double n=1.0;
int k=2;
double sum=0;
while(k<=100)
{
sum=sum+n/k;
k+=2;
}
System.out.println("sum of series " + sum);
}
public static void main(String[] args)
{
Series();
}

}