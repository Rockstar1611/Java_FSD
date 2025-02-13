package App_Packages;

import java.util.Scanner;

public class FibonacciApp {
//num1 and num2 are assumed to perform 0,1,1,2,3 and add num1+num2 next num of fib//
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number n is: ");
		int n=scan.nextInt();
		Fibonacci f=new Fibonacci();
		f.FibonacciSeries(n);
	}

}
