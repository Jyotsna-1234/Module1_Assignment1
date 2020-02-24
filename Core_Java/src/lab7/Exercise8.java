package lab7;
import java.util.*;
public class Exercise8 {
	
	static void  modifyArray(int arr[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
			list.add(new Integer(arr[i]));
		Set<Integer>set=new TreeSet<Integer>(list);
	System.out.println("printing the non duplicate elements ");	
	int size=set.size();
	System.out.println(set);System.out.println("descneding order ");
	NavigableSet<Integer> navset=((TreeSet<Integer>) set).descendingSet();
	 for(Integer itr:navset)
		 System.out.println(itr);

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of the array ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		Exercise8.modifyArray(arr);
		
	}}
