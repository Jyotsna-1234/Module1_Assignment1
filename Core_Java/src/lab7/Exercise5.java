package lab7;

import java.util.*;

public class Exercise5 {
	
static int getSecondSmallest(int arr[])
{
	
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	for(int i=0;i<arr.length;i++)
	{
		list.add(new Integer(arr[i]));
	}
	
	Collections.sort(list);
	System.out.println("second smallest element  ");
	return list.get(1);
	}



	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of the array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Exercise5.getSecondSmallest(arr));
		
	//	System.out.println(list.get(1));
		
	}}