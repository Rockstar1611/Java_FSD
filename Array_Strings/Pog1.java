package Arrays;

import java.util.Scanner;

public class Pog1 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array length :");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter Array elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println("Enter an element :");
			arr1[i]=scan.nextInt();
		}
		System.out.println("Array 1 contents are :");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println(arr1[i]+" ");
		}
		System.out.println();
		int arr2[]=new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Array 2 contents are : ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
