package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class student
{
	private int age;
	private String sname;
	public int getAge()
	{
		return age;
	}
	public String getSname()
	{
		return sname;
	}
	public int setAge()
	{
		return age;	
	}
	public String setSname()
	{
		return sname;
	}
	student(int age,String sname)
	{
		this.age=age;
		this.sname=sname;
	}
	public String toString()
	{
		return "Student [age = " + age +", sname = " + sname +"]";

	}
}
public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(5,"Manas");
		student s2 = new student(6,"Tripathi");
		student s3 = new student(7,"Raj");
		
		List<student> studentList = new ArrayList<student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
//		for(student s : studentList)
//		{
//			System.out.println(s.toString());
//
//		}
		
		Iterator<student> itr = studentList.iterator();
		
		while(itr.hasNext())
		{
			student s = itr.next();
			System.out.println(s.getAge()+ " "+ s.getSname());

		}

	}

}
