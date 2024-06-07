package inheritance;


interface animal1
{
	public void eat();
	
}

class doggy implements animal1
{
	public void bark()
	{
		System.out.println("Dog bark that is his sound");

	}
	
	@Override
	public void eat()
	{
		System.out.println("animal eat foods");
	}
}

class elephant extends doggy
{
	public void moaah()
	{
		System.out.println("elephant is making sound meow");

	}
}

public class multipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elephant eobj = new elephant();
		eobj.bark();
		eobj.eat();
		eobj.moaah();
	}

}
