package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> nums = new HashSet<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		//nums.add(null);
		System.out.println(nums);
		
		List<Integer> list = new ArrayList(nums);
		
		Collections.sort(list);
		System.out.println(list);

	}

}
