package lab7;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Exercise6 {
	
	//******************************************without implemention the date *******************************
	
	/*static List<Integer> votersList(HashMap<Integer,Integer> hashmap)
	
	{
		List<Integer> list=new ArrayList<Integer>();
	     Set<Integer> set=hashmap.keySet();
           for(Integer i:set)
        	   
           { 
        	   if(hashmap.get(i)>18)
        		   
		 list.add(hashmap.get(i))	;         }
	return list;
	}
	public static void main(String args[])
	{
		HashMap<Integer,Integer> hashmap=new HashMap<>();
		
		hashmap.put(101, 23);
		hashmap.put(102, 20);
		hashmap.put(105, 17);
		hashmap.put(104, 16);
		
		System.out.println(votersList(hashmap));
	}
	*/
	
	static List<Integer> votersList(HashMap<Integer,LocalDate> hashmap)
	{
		Set<Integer> set1=hashmap.keySet();
		LocalDate localdate=null;
		LocalDate date=LocalDate.now();
		List<Integer> list1=new ArrayList<Integer>();
		for(Integer integer:set1)
		{
			localdate=hashmap.get(integer);
			
			int year=Period.between(localdate, date).getYears();
			if(year>=18)
				list1.add(integer);
		}
			return list1;
			
	}
	public static void main(String args[])
	{
		HashMap<Integer,LocalDate> hashmap=new HashMap<>();
		
		hashmap.put(101, LocalDate.of(2000,1,11));
		hashmap.put(102, LocalDate.of(2002,2,06));
		hashmap.put(103, LocalDate.of(2001,3,10));
		
		System.out.println(votersList(hashmap));
	}
			
}			


