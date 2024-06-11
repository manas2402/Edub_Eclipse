package collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Integer, String> sobj = new TreeMap<Integer, String>();
		
		sobj.put(4, "Banana");
		sobj.put(5, "Apple");
		sobj.put(2, "Orange");
		sobj.put(3, "Cherry");
		sobj.put(1, "Guava");
		
		System.out.println(sobj.entrySet());
		
		for(Map.Entry<Integer, String> oneEntry : sobj.entrySet())
		{
			System.out.println(sobj.keySet());
			//print only value
			System.out.println(sobj.values());
		}

	}

}
