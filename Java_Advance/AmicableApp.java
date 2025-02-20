package App_Packages;

import java.util.Scanner;

public class AmicableApp {
//num1=6 div 1 2 3 6,1+2+3+6=12,sum1=12,res1=num1/sum1=12/6=2 ,value sum1 by num1 is  2//
//num2=28 div 1 2 4 7 14 28,sum2=57,res2=sum2/num2=57/28=2, value sum2 by num2 is 2 //
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 2 numbers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum1=Amicable.FindSum(num1);
		int sum2=Amicable.FindSum(num2);
		int res1=sum1/num1;
		int res2=sum2/num2;
		if(res1==res2)
		{
			System.out.println("Enter number : "+num1+" and "+num2+" are friendly paires");
		}
		else
		{
			System.out.println("Enter number : "+num1+" and "+num2+" are not friendly paires");
		}
	}

}
