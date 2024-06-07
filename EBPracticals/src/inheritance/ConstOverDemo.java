package inheritance;

class student
{
	int age;
	String sname;
	
	student(int a, String s)
	{
		age = a;
		sname = s;
	}
	public void showStudent()
	{
		System.out.println("Student name : "+sname);
		System.out.println("Student age: "+ age);

	}
}

class marks extends student
{
	int m1,m2,m3;
	
	marks()
	{
		super(27,"Manas");//calling parent class constructor using super
		m1 = 67;
		m2 = 77;
		m3 = m1+m2;
	}
	public void showMarks()
	{
		System.out.println("Student Marks : "+ m1 + " "+m2);
		System.out.println("Student total: "+ m3);

	}
}

public class ConstOverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marks m = new marks();
		m.showStudent();
		m.showMarks();
	}

}
