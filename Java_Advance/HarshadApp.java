package App_Packages;

import java.util.Scanner;

public class HarshadApp 
{
//ex:18 ,1+8=9, 9/18=2, remainder is "0" so it's a harshad number //
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		boolean res=Harshad.detectHarshad(num);
		System.out.println("Remainder is: "+res);
		if(res==true)
		{
			System.out.println("Enter number : "+num+" is Harshad number");
		}
		else
		{
			System.out.println("Enter number : "+num+" is not Harshad number");
		}
	}

}