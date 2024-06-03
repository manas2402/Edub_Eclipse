package ClassesAndObjects;

class person{
	private int age;
	private String sname;
	
	person(int age, String sname){
		this.age=age;
		this.sname=sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
}


public class ArraysofObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person [] p1 = new person[2];
		
		
		person p2 = new person(20,"Manas");
		System.out.println(p2.getAge() + " " + p2.getSname());
		System.out.println("----------------");
		
		p1[0] = new person(10,"Santhosh");
		System.out.println(p1[0].getAge() + " " + p1[0].getSname());
		System.out.println("----------------");
		
		p1[1] = new person(30,"Abey");
		
		for(int i = 0; i<p1.length;i++) {
			System.out.println(p1[i].getAge() + " " + p1[i].getSname());
			System.out.println("----------------\\\\\\\\\\\n");
		}
		
		for(person p : p1) {
			System.out.println(p.getAge() + " " + p.getSname());
			System.out.println("----------------");
		}
	}

}
