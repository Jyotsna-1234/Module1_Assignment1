package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

static int secondSmallest(int a[])
{
   
Arrays.sort(a);
	
	
	
	return a[1];
      	
}

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the arraa");
	
	int n= sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the elements of the array"+'\n');
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
	System.out.println(Exercise1.secondSmallest(a));
}
}

