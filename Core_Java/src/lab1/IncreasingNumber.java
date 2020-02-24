
package lab1;
import java.io.*; 

class IncreasingNumber { 
  

static boolean checkNumber(int n) 
{ 
    boolean flag = true; 
   
    int prev = -1;  
      
    
    int type = -1;  
  
    while(n != 0) 
    { 
        if(type ==-1) 
        { 
            if(prev ==-1) 
            { 
                prev = n % 10; 
                n = n/10; 
                continue; 
            } 


            if(prev == n % 10)  
            {  
                flag = false; 
                break; 
            } 
            
            if(prev > n % 10)  
            {  
                type = 1; 
                prev = n % 10; 
                n = n/10; 
                continue; 
            } 
              
            prev = n % 10; 
            n = n / 10; 
        } 
        else
        {  
          
            if(prev == n % 10)  
            {  
                flag = false; 
                break; 
            } 
          
            if(prev < n % 10)  
            {          
                flag = false; 
                break; 
            } 
              
            prev = n % 10; 
            n = n / 10; 
        } 
    } 
  
    return flag; 
} 
   public static void main (String[] args) { 
        int n = 123454321; 
      
    if(checkNumber(n)) 
        System.out.println("YES"); 
    else
        System.out.println("NO"); 
    } 
} 
 
	

