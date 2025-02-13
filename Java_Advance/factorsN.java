package App_Packages;

public class factorsN 
{
	static void Factors(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
