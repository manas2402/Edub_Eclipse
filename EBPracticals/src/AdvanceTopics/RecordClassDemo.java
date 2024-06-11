package AdvanceTopics;

import java.util.Objects;

//class animal
//{
//	private int acode;
//	private String name;
//	
//	private animal(int acode, String name)
//	{
//		this.acode = acode;
//		this.name = name;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(acode, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		animal other = (animal) obj;
//		return acode == other.acode && Objects.equals(name, other.name);
//	}
//
//	@Override
//	public String toString() {
//		return "animal [acode=" + acode + ", name=" + name + "]";
//	}
//	
//}

record animal (int id, String name) {
	public animal()
	{
		this(0,"");
	}
	animal(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}


public class RecordClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a1 = new animal(101,"cat");
		animal a2 = new animal(101,"cat");
		animal a3 = new animal();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(a1.equals(a2));
	}

}
