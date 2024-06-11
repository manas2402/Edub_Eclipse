package StreamApiDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = new ArrayList<Integer>();

		nums.add(5);
		nums.add(4);
		nums.add(8);
		nums.add(2);
		nums.add(3);
		
		List<Integer> result = nums.stream()
									.filter(n-> n % 2 == 0)
									.map(n-> n*2)
									.sorted()
									.collect(Collectors.toList());
		
		System.out.println(result);
		
		List<Integer> nums1 = Arrays.asList(2,3,98,7,6,9);		
		nums1.stream()
			.filter(m-> m % 2 == 0)
			.map(m-> m*2)
			.sorted()
			.forEach(m -> System.out.println(m));

	}

}
