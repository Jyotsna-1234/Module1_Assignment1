package lab6;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Exp1 {

	public static void main(String args[])
	{
		System.out.println("enter the string of intger with whitespacing"+'\n');
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		
		StringTokenizer n=new StringTokenizer(str," ");
		int sum=0,n2;
		while(n.hasMoreTokens())
		{
			String num=n.nextToken();
			System.out.println(num);
			 n2=Integer.parseInt(num);
			sum=sum+n2;
			
		}
		System.out.println("the sum is   "+sum);
	}
}
