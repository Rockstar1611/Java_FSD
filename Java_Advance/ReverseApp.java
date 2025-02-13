package App_Packages;

import java.util.Scanner;

public class ReverseApp {
//reverse the numbers//
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		Reverse r=new Reverse();
		int res=r.ReverseNum(num);
		System.out.println("Reverse the number: "+res);
	}

}
