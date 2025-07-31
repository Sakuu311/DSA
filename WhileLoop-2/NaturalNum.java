class NaturalNum
{
public static void printNaturalNum()
{
int i=1;
int sum=0;
while(i<=100)
{
sum=sum+i;
i++;
}
System.out.println("Sum of all natural number:" + sum);
}

public static void main(String[] args)
{
printNaturalNum();
}
}