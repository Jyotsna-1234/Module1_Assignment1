package lab1;

import java.util.Scanner;

public class PowerOfTwo {
 
 public static void main(String[] args) {
	 Scanner n=new Scanner(System.in);
	 
 
 }
 
 private static boolean powerOf2(int n){
  if(n<=0){
   return false;
  }
   
  while(n > 1){
   if(n % 2 != 0){
    return false;
   }
   n = n / 2;
  }
  return true;
 }
 
}


