package App_Packages;

import java.util.Scanner;

public class AbundentApp {
// 12 proper factors , 12346=1+2+3+4+6=16 so 12>16 it is a abundent number.//
	                  // AND //
// 15 proper factors , 135=1+3+5=9 so 9<15 it is deficient number. //
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		boolean res=Abundant.detectAbundent(num);
		if(res==true)
		{
			System.out.println("Enter number : "+num+" is Abundent number.");
		}
		else
		{
			System.out.println("Enter number : "+num+" is not a Abundent number.");
		}
	}

}
