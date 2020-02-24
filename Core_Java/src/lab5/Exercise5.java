package lab5;

import java.util.Scanner;

import javax.xml.bind.ValidationException;

public class Exercise5 extends Exception {
public static void main(String args[]) throws ValidationException
{
	Scanner sc=new Scanner(System.in);
   System.out.println("Enter the age of the person  ");
    int age=sc.nextInt();
      Exercise5.ageValidate(age);
}
static void ageValidate(int age) throws ValidationException
{
	if(age>15)
		System.out.println("the person age is validate "+age);
	
	else
		throw new ValidationException("the entered age sghould be above 15");
}
}
