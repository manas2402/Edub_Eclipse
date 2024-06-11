package AdvanceTopics;


class human
{
	private int age;
	private String name;
	
	public human(int age, String name)
	{
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "human [age=" + age + ", name=" + name + "]";
	}
	
}
public class tostringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		human h1 = new human(10,"Manas");
		human h2 = h1;
		
		System.out.println(h1.toString());
		System.out.println(h2);

		System.out.println(h1.equals(h2));

	}

}
