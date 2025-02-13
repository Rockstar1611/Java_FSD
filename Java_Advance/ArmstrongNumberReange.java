package App_Packages;

import java.util.Scanner;

public class ArmstrongNumberReange {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int count=0;
		for(int i=a;i<=b;i++)
		{
			int power=ArmstrongNumber.getCount(i);
			int res=ArmstrongNumber.getSum(i, power);
			if(i==res)
			{
				System.out.println("Armstrong number from "+a+" to "+b+" is: "+i);
				count++;
			}
		}
	}

}
