package App_Packages;

import java.util.Scanner;

public class StringNiumberRange {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Strong number: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		for(int i=a;i<=b;i++)
		{
			StringNumber sn=new StringNumber();
			boolean res=sn.detectStrong(i);
			if(res==true)
			{
				System.out.println(i+" is a String number.");
			}
		}
	}

}
