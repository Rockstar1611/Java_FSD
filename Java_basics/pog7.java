package Rockstar;

import java.util.Scanner;

public class pog7 
{
//even or odd numbers//
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=scan.nextInt();
		if(n%2==0)
		{
			System.out.println("Enter number: "+n+" is a Even.");
		}
		else
		{
			System.out.println("Enter number: "+n+" is a Odd.");
		}
	}

}
