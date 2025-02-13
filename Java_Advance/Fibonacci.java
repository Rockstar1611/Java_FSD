package App_Packages;

public class Fibonacci 
{
	void FibonacciSeries(int n)
	{
		int num1=0;
		int num2=1;
		if(n==1)
		{
			System.out.println(num1);
		}
		else if(n==2)
		{
			System.out.println(num1+" "+num2);
		}
		else
		{
			System.out.println(num1+" "+num2+" ");
			for(int i=3;i<=n;i++)
			{
				int fib=num1+num2;
				System.out.println(fib+" ");
				num1=num2;
				num2=fib;
			}
		}
	}
}
