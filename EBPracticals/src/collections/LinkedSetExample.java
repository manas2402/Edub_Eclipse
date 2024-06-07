package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> nums = new LinkedHashSet<Integer>();
		try {
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		//nums.add(null);
		
		System.out.println(nums);
		
		Iterator<Integer> itr = nums.iterator();
		
		while(itr.hasNext())
		{
			int s = itr.next();
			System.out.println(s);

		}
		}
		catch(NullPointerException e)
		{
			System.out.println("it ia an exception of null value");

		}

	}

}
