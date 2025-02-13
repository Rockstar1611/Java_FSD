package App_Packages;

public class perfect 
{
	public static int Perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
