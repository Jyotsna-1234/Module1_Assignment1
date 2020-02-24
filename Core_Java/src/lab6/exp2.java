package lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class exp2 {

	public static void main(String args[]) throws IOException
	{
		FileInputStream f1=new FileInputStream("E:\\file handling\\capge\\file1.txt");
		///FileOutputStream f2=new FileOutputStream("\"E:\\\\file handling\\\\capge\\\\file1.txt\"")
		int i=0,count=1;
		System.out.print("1"+" ");
		while((i=f1.read())!=-1)
		{


       System.out.print((char)i);  
         String.valueOf(i);
         if(i=='\n')
         {
        	 //count++;
        	 System.out.println();
        	
        	 count++;
        	 System.out.print(count+" ");
         }
         
		}
         f1.close();
		}}
	