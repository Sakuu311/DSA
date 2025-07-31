import java.util.Scanner;
class checkProfitLoss{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter CP : ");
int cp=sc.nextInt();
System.out.println("The CP : " + cp);

System.out.println("Enter SP : ");
int sp=sc.nextInt();
System.out.println("The SP : " + sp);


if(sp>cp){
double Profit=sp-cp;
System.out.println("Profit = " + Profit );
double ProfitPercentage = (Profit/cp)*100;
System.out.println("The profit% = " + ProfitPercentage);
}
else if(sp<cp){
double Loss=cp-sp;
System.out.println("Loss = " + Loss );
double LossPercentage = (Loss/cp)*100;
System.out.println("The loss% = " + LossPercentage);
}


}
}