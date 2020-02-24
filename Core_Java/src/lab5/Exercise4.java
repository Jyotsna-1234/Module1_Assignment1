package lab5;

import java.util.Scanner;

public class Exercise4 extends Exception{

	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the f_name");
		String s1=sc.nextLine();
		System.out.println("enter the l_name");
		String s2=sc.nextLine();
		Exercise4.validate(s1, s2);
	}
	/*public class Error NullException(String msg)
	{
		super("name is null"+msg);
		
	}*/

static void validate(String s1,String s2) 
{
	if((s1==null)||(s2==null))
	{
		throw new NullPointerException("name is not entered");
	}
	//else if((s1>'A')&&(s1<'Z'))
	else
		System.out.println("the name is validate "+s1+" "+s2);
	
	
}
}


