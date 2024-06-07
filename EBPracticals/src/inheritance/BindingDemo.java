package inheritance;

interface A
{
	public void showA();
}

class B implements A
{
	public void showB()
	{
		System.out.println("This is B");

	}
	public void showA()
	{
		System.out.println("This is A");
	}
}
public class BindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A bobj = new B();
		bobj.showA();//runtime binding
	}

}
