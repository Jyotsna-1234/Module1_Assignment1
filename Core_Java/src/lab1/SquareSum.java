package lab1;

import java.util.Scanner;

public class SquareSum {
	static void calculateDiffernce(int n)
	{
		int s1,sum=0;
	
		s1=(n*(n+1)*((2*n)+1))/6;
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		sum=2*sum;
		int Diff=s1-sum;
		System.out.println("the difference of the sum "+Diff);
		
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any natural number ");
		int n =sc.nextInt();
		
		calculateDiffernce(n);
		
	}
}

