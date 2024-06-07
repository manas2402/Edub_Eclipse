package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> students = new HashMap<Integer,String>();
		
		students.put(101, "Sandy");
		students.put(102, "Manas");
		students.put(103, "Tripaathi");
		students.put(104, "Vikram");
		students.put(105, "Sud");
		//printing the entries
		System.out.println(students);
		//print only key
		System.out.println(students.keySet());
		//print only value
		System.out.println(students.values());
		
		for(Map.Entry<Integer, String> entry : students.entrySet())
		{
			System.out.println(students.keySet());
			//print only value
			System.out.println(students.values());
		}
		
		Set oneEntry = students.entrySet();
		
		Iterator itr = oneEntry.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> oneRecord = (Entry<Integer, String>) itr.next();
			System.out.println(oneRecord.getKey()+ " " + " " +oneRecord.getValue());
		}
		System.out.println(students.entrySet());

		

	}

}
