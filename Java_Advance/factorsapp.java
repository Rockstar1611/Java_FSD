package App_Packages;

import java.util.Scanner;

public class factorsapp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number it is a factor of 10 or not: ");
		int num=scan.nextInt();
		factors f=new factors();
		boolean res=f.Factors(num);
		if(res==true)
		{
			System.out.println("It is a factor of 10 :"+res);
					
		}
		else
		{
			System.out.println("Itis not a factor of 10: "+res);
		}
	}

}