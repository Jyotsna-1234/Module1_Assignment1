package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int n=sc.nextInt();
        String s[]=new String[n];
        
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextLine();
		}
		
		Arrays.sort(s);
		System.out.println("sorted array  ");
		if(n%2==0)
		{
		for(int i=0;i<n/2;i++)
		{
			System.out.println(s[i].toUpperCase());
		}
		for(int i=(n/2);i<n;i++)
		{
			System.out.println(s[i].toLowerCase());
		}
		}
		else
		{

			for(int i=0;i<=(n/2);i++)
			{
				System.out.println(s[i].toUpperCase());
			}
			for(int i=(n/2)+1;i<n;i++)
			{
				System.out.println(s[i].toLowerCase());
			}
		}
		
		}
		

	}
