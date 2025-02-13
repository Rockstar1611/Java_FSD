package Rockstar;

public class prime 
{
	boolean ChechPrime(int n)
	{
		if(n==0 ||n==1)
		{
			return false;
		}
		else if(n==2)
		{
			return true;
		}
		else
		{
			if(n%2==0)
			{
				return false;
			}
			return true;
		}
	}
}
