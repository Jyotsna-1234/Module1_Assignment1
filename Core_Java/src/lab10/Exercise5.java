package lab10;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Exercise5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no :");
		int n=sc.nextInt();
		System.out.println("tha factorial of the entered no is :"+factorialUsingStreams(n));
	}
	

public static long factorialUsingStreams(int n) {
    return LongStream.rangeClosed(1, n)
        .reduce(1, (long x, long y) -> x * y);
}}