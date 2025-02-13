package App_Packages;

import java.util.Scanner;

public class factorsNApp {
//factors 6=1,2,3,6 like.//
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number n: ");
		int num=scan.nextInt();
		factorsN.Factors(num);
	}

}