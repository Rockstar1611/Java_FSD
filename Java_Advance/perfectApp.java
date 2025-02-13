package App_Packages;

import java.util.Scanner;

public class perfectApp {
//factors are add not equal to come "n" value ex:6 1+2+3=6//
	public static void main(String[] args)
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		perfect p=new perfect();
		int res=p.Perfect(num);
		{
			if(num==res)
			{
				System.out.println("It is a Perfect number: "+num);
			}
			else
			{
				System.out.println("It is not a Perfect number: "+num);
			}
		}
	}

}
