package lab3;

import java.util.Scanner;

public class Experiment3 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the size of te array ");
		int n=sc.nextInt();
		int a[]=new int [n];
		int p[]=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{

			 p[i]=a[i]%10;  
			    a[i]=a[i]/10;  
		}
		
		System.out.println("array after reversingb the num  ");
		for(int i=0;i<n;i++)
		{
			System.out.println( p[i]);

		}}}
