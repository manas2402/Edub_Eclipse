package StreamApiDemo;

import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> admnos = List.of(3,5,7,2,1,8);
		
		admnos.stream()
						.sorted()
						.forEach(n-> System.out.println(n));
		
		System.out.println(admnos);
	}

}
