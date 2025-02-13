package Rockstar;

import java.util.Scanner;

public class FindSum {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range from a to b is : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of numbers from "+a+" to "+b+" is: "+sum);
	}

}
