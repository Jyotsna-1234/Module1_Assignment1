package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Experiment4 {
	
	static void count(char[]ch)
	{
		int count=1;
		
		Arrays.sort(ch);
		System.out.println("the sorted array  ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	for(int i=0;i<ch.length;i++)
	{
		count=0;
		if(ch[i]==ch[i+1])
		{
			count++;
		}
		
		System.out.println(count);
	}
	
	
	}

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);


	char []ch= {'a','g','b','e','a','a'};

       Experiment4.count(ch);
	
	
	
}
}
