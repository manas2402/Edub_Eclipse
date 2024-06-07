package AbstractClasses;

abstract class bike
{
	//abstract method
	abstract public void run();
	//normal method
	public void mileage()
	{
		System.out.println("bike has the good mileage");

	}
}

class honda extends bike
{
	public void run()
	{
		System.out.println("honda bike is running");

	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honda hobj = new honda();
		hobj.mileage();
		hobj.run();
	}

}
