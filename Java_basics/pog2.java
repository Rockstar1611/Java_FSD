package Rockstar;

import java.util.Scanner;

public class pog2 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a key 1 :");
		int num=scan.nextInt();
		if(num==1)
		{
			System.out.println("You have entered 1.");
		}
		else
		{
			System.out.println("Please check the message");
		}
		
		
		System.out.println("Enter a key from 1-4 on keybord : ");
		int n=scan.nextInt();
		if(n==1)
		{
			System.out.println("You entered 1 on keybord");
		}
		else if(n==2)
		{
			System.out.println("You entered 2 on keybord");
		}
		else if(n==3)
		{
			System.out.println("You entered 3 on keybord");
		}
		else if(n==4)
		{
			System.out.println("You entered 4 on keybord");
		}
		else
		{
			System.out.println("Please Check the message carefully");
		}
	}
}