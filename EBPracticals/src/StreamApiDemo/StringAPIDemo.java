package StreamApiDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();

		names.add("Lucknow");
		names.add("Agra");
		names.add("Chennai");
		names.add("Delhi");
		names.add("Banglore");
		
		int result = names.stream()
									.sorted()
									.map(String::length)
									.reduce(0,Integer::sum);//
									//.collect(Collectors.toList());
			
		System.out.println(result);

	}

}
