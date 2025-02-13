package Rockstar;

import java.util.Scanner;

public class primeApp
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		prime p=new prime();
		for(int i=a;i<=b;i++)
		{
		   boolean res=p.ChechPrime(i);
		   if(res==true)
		   {
			   System.out.println(i);
		   }
		}
	}
}