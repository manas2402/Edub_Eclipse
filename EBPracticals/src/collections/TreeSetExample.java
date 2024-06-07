package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> str = new TreeSet<String>();
		
		str.add("Bac");
		str.add("efg");
		str.add("qwe");
		str.add("tyu");
		str.add("Bac");
		
		System.out.println(str);
		
		Iterator<String> itr = str.iterator();
		while(itr.hasNext());
		{
			String val = itr.next();
			System.out.println(val);

		}
	}

}
