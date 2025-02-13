package Rockstar;

import java.util.Scanner;

public class pog8
{
//Quadratic values like in gragh representation//
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the x and y values : ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		if(x>0 && y>0)
		{
			System.out.println("Enter points in the 1st quadrant");
		}
		else if(x<0 && y>0)
		{
			System.out.println("Enter points in the 2nd quadrant");
		}
		else if(x<0 && y<0)
		{
			System.out.println("Enter points in the 3rd quadrant");
		}
		else if(x>0 && y<0) 
		{
			System.out.println("Enter points in the 4th quadrant");
		}
		else if(x!=0 && y==0)
		{
			System.out.println("Enter points in the x-axis.");
		}
		else if(x==0 && y!=0)
		{
			System.out.println("Enter points in the y-axis.");
		}
		else
		{
			System.out.println("Enter points in the orgin.");
		}
	}

}
