class Que15
{
public static void Series()
{
double n=1.0;
int k=1;
double sum=0;
while(k<=99)
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