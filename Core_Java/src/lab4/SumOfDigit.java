package lab4;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the digit ");
		 int n=sc.nextInt();
		 int a,c=0;
		 while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		System.out.println("the sum of the square of the digit number   "+c);
		
	}
}
