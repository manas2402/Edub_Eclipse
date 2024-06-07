package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Cherry");
		fruits.add("Lichi");
		
		System.out.println("Fruits are : "+fruits);

		fruits.add(2,"Manago");
		System.out.println("Fruits are : "+fruits);
		
		System.out.println("element at the index 3 : "+fruits.get(3));
		
		fruits.remove(4);
		System.out.println("fruits are : "+fruits);

		fruits.set(1,"mango");
		System.out.println("fruits are : "+fruits);
		
		System.out.println("the size of the list : "+fruits.size());
		
		for(String fruit : fruits)
		{
			System.out.println(fruit);

		}
		
//		collections.sort(fruits);
//		System.out.println(fruits);

	}	

}
