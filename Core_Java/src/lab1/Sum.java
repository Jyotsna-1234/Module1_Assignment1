package lab1;

import java.util.Scanner;

public class Sum {
		static void calculateSum(int n)
		{ int sum=0;
			for(int i=1;i<=n;i++)
			{
				if((i%3==0)||(i%5==0))
				sum=i+sum;
			}
			
			System.out.println("the sum of the natural no is "+sum);}
			public static void main(String[] args)
			{
				
				Scanner sc= new Scanner(System.in);
				System.out.println("enter nay natural number");
				int n=sc.nextInt();
				calculateSum(n);
				
				
				
				
				
			}
				
		
		
	}


