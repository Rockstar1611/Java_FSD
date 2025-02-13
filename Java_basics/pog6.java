package Rockstar;

import java.util.Scanner;

public class pog6
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		if(num1>num2)
		{
			System.out.println("Number 1 : "+num1+" is greater");
		}
		else
		{
			System.out.println("Number 2 : "+num2+" is greater");
		}
		
		System.out.println("Enter 3 numbers : ");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		if(n2<n1 && n3<n1)
		{
			System.out.println("Number 1 : "+n1+" is greater");
		}
		else if(n1<n2 && n3<n2)
		{
			System.out.println("Number 2 : "+n2+" is greater");
		}
		else
		{
			System.out.println("Number 3 : "+n3+" is greater");
		}
	}

}
