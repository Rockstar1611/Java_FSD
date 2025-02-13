package Rockstar;

import java.util.Scanner;

public class pog3 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the any number from 1-8 : ");
		int num=scan.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("you have entered-1");
			break;
		case 2:
			System.out.println("you have entered-2");
			break;
		case 3:
			System.out.println("you have entered-3");
			break;
		case 4:
			System.out.println("you have entered-4");
			break;
		case 5:
			System.out.println("you have entered-5");
			break;
		case 6:
			System.out.println("you have entered-6");
			break;
		case 7:
			System.out.println("you have entered-7");
			break;
		case 8:
			System.out.println("you have entered-8");
			break;
		
		default:
			System.out.println("Please check the message carefully");
		}
	}
}
