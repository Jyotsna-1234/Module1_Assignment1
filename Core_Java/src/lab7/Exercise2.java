package lab7;
import java.util.*;
public class Exercise2 {
	
	static HashMap<Character,Integer>countCharacter(Character character[])
	{
		HashMap<Character,Integer> hashmap=new HashMap<>();
		
		List<Character> list1=Arrays.asList(character);
		int c=0;
		for(Character character1 :list1)
		{
			c=0;
		c=Collections.frequency(list1, character1);
		hashmap.put(character1, c);
		
		}
		return hashmap;


	}
	
	public static void main (String args[])
	{
		Character[] character= {'a','p','p','l','e'};
		System.out.println(countCharacter(character));
		
	}

}
