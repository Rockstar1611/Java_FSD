package App_Packages;

import java.util.Scanner;

public class SumDigitsApp {
//sum of digits in the number//
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		SumDigits sd=new SumDigits();
		int res=sd.FindSum(num);
		System.out.println("Sum of the digits in the number: "+res);
	}

}
