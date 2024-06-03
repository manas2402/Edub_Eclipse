package innerClass;

class annonymous
{
	private String sname;
	private int age;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showStudent(int a, String s) {
		age =a;
		sname=s;
		
		System.out.println(a);
		System.out.println(s);
	}
}

public class AnnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		new annonymous().setAge(20);
//		new annonymous().setSname("Tripathi");
//		
//		annonymous aobj = new annonymous();
//		aobj.setAge(10);
//		aobj.setSname("Manas");
//		
//		System.out.println(aobj.getSname());
//		System.out.println(aobj.getAge());
		
		new annonymous().showStudent(10, "Manas");
		
	}

}
