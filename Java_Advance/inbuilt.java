package App_Packages;

import java.util.Scanner;

public class inbuilt {
//syntific required to prove root of number
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base and exponent: ");
		int base=scan.nextInt();
		int exp=scan.nextInt();
		int r1=(int)Math.pow(base, exp);
		System.out.println("Result of inbuilt function: "+r1);
		userDefined ud=new userDefined();
		int r2=ud.Power(base, exp);
		System.out.println("Result of user defined fuction: "+r2);
	}

}
