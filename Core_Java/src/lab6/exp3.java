package lab6;

import java.util.Scanner;
public class exp3 {
	
static void getImage(String str) {
	StringBuffer str1=new StringBuffer();
	str1.append(str);
	System.out.println(str1+"|"+str1.reverse());
}
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		
		String str=sc.nextLine();
		
		exp3.getImage(str);
		}
}