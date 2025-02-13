package Rockstar;

import java.util.Scanner;

public class Palindrome 
{
	//reverse number is same//
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();
		int rev=0;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(num==rev)
		{
			System.out.println("Enter number : "+rev+" is a polindrome");
		}
		else
		{
			System.out.println("Enter number : "+rev+" is not a polindrome");
		}	
	}

}
