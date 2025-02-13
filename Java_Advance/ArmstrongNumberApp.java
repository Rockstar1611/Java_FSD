package App_Packages;

import java.util.Scanner;
//Armstrong number means sum the number like 153 and
//its power last number 3 and sum the digits its value is 153(1*3+5*3+3*3 =1+125+27=153)//
public class ArmstrongNumberApp {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=scan.nextInt();
		int power=ArmstrongNumber.getCount(num);
		int res=ArmstrongNumber.getSum(num, power);
		if(num==res)
		{
			System.out.println("Enter number: "+num+" is Armstrong number.");
		}
		else 
		{
			System.out.println("Enter number: "+num+" is not Armstrong number.");
		}
	}

}
