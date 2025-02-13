package App_Packages;

import java.util.Scanner;

public class AutomorphicApp {
//ex:(25)(25)=625 last num is same is automorphic//
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=scan.nextInt();
		boolean res=Automorphic.detectAutomorphic(n);
		if(res==true)
		{
			System.out.println("Enter number is a Automorphic: "+n);
		}
		else
		{
			System.out.println("Enter number is not a Automorphic: "+n);
		}
	}

}
