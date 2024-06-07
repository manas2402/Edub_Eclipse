package AbstractClasses;

interface inter1
{
	public void display();
}
interface inter2 extends inter1
{
	public void display2();
}

abstract class sample implements inter1
{
	abstract public void design();
}

class concrete extends sample
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("it is displaying");

	}

	@Override
	public void design() {
		// TODO Auto-generated method stub
		System.out.println("it is designing");
	}
	
	public void display2() {
		System.out.println("it is displaying2");
	}
	
}

public class interfacewithAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concrete cobj = new concrete();
		cobj.design();
		cobj.display();
		cobj.display2();
	}

}
