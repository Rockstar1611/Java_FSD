package App_Packages;

public class userDefined
{
	//roots to determined in normal way.//
	int Power(int base,int exp)
	{
		int power=1;
		for(int i=1;i<=exp;i++)
		{
			power=power*base;
		}
		return power;
	}
	
}
