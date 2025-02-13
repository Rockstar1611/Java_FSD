package Rockstar;

import java.util.Scanner;

public class SumN 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n=scan.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of "+n+" natural numbers is: "+sum);
	}

}
