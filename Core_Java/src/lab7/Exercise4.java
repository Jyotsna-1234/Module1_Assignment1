package lab7;
import java.util.*;
public class Exercise4 {
//key is registration num and values as the marks 
	// string medals
	static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hashmap){
		
		HashMap<Integer,String> hashMap1=new HashMap<>();
		Set<Integer> reg_set=hashmap.keySet();
		String medal=null ;
		int marks;
		for(Integer key:reg_set)
		{
			marks=hashmap.get(key);
			
			if(marks>=90)
				medal="Gold";
			else if(marks>=80&& marks<90)
				medal="Silver";
			else if (marks>=70 && marks<80)
				medal="Bronze";
			
			hashMap1.put(key,medal);
		}
		return hashMap1;
		
	}
	
	
	public static void main(String args[])
	{
		HashMap<Integer,Integer> hashmap2=new HashMap<>();
		hashmap2.put(101,90);
		hashmap2.put(102,88);
		hashmap2.put(103,56);
		hashmap2.put(104,89);
		hashmap2.put(105,50);
		
		System.out.println(getStudents(hashmap2));
	}
}
