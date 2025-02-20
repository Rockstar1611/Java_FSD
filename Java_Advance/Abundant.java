package App_Packages;

public class Abundant 
{
	static boolean detectAbundent(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
	    {
			if(num%i==0)
		    {
				sum=sum+i;
		    }
		}
	    if(sum>num)
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	}
}