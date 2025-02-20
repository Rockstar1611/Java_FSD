package App_Packages;

public class Harshad 
{
	static  boolean detectHarshad(int num)
	{
		int original=num;
		int sum=0;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if(original % sum==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
