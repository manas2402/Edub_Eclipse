package inheritance;

class animal
{
	public void sound()
	{
		System.out.println("it is making sound");

	}
	
}

class dog extends animal
{
	public void bark()
	{
		System.out.println("Dog bark that is his sound");

	}
}

class cat extends animal
{
	public void meow()
	{
		System.out.println("cat is making sound meow");

	}
}
public class multiInstanceHeritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat cobj = new cat();
		
		cobj.meow();
		cobj.sound();
		
		//not allowed as multiple inheritance in class is not allowed this we can't access
		//using cobj.bark();
	}

}
