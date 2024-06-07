package inheritance;

interface animals
{
	public void eat();
	
}

class dogg
{
	public void bark()
	{
		System.out.println("Dog bark that is his sound");

	}
}

class mouse extends dogg implements animals
{
	public void mimi()
	{
		System.out.println("elephant is making sound meow");

	}
	@Override
	public void eat()
	{
		System.out.println("animal eat foods");
	}
}

public class mulyipleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mouse eobj = new mouse();
		eobj.bark();
		eobj.eat();
		eobj.mimi();
	}

}
