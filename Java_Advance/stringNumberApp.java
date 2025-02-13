package App_Packages;

import java.util.Scanner;

public class stringNumberApp {
//145 ,,1!+4!+5!=145 so it's string number//
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Strong number: ");
		int n=scan.nextInt();
		StringNumber sn=new StringNumber();
		boolean res=sn.detectStrong(n);
		if(res==true)
		{
			System.out.println("Enter the number "+n+" is Strong number: "+res);
		}
		else
		{
			System.out.println("Enter the number "+n+" is  not Strong number: "+res);
		}
	}

}
