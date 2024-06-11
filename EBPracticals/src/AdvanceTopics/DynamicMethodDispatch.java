package AdvanceTopics;

class A
{
	public void display()
	{
		System.out.println("this is A method");

	}
}

class B extends A
{
	public void display()
	{
		System.out.println("this is B method");

	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.display();
		
		obj = new A();
		obj.display();
	}

}
