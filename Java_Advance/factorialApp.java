package App_Packages;

import java.util.Scanner;

public class factorialApp {
//factors of given number//
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the factorial number: ");
		int num=scan.nextInt();
		factorial f=new factorial();
		int res=f.Factorial(num);
		System.out.println("Factorial number "+num+" is: "+res);
	}

}
