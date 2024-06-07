package AbstractClasses;

abstract class vechile
{
	private String mName;
	
	vechile(String mName)
	{
		this.mName = mName;
	}

	public String getmName() {
		return mName;
	}

	public abstract void start();
	public abstract void stop();
}

class car extends vechile
{
	car(String Named)
	{
		super("Manas");
		
	}
	
	public void start()
	{
		System.out.println(getmName()+ " Car is started");

	}
	public void stop()
	{
		System.out.println(getmName()+" Car is getting stopped");

	}
}

class Bicycle extends vechile
{
	Bicycle(String Names)
	{
		super("Tripathi");
	}
	public void start()
	{
		System.out.println(getmName()+ " Bicycle is started");

	}
	public void stop()
	{
		System.out.println(getmName()+" Bicycle is getting stopped");

	}
	
}

public class AbstractRealDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bobj = new Bicycle("Trek cycle");
		bobj.start();
		bobj.stop();
		
		car cobj = new car("trek car");
		cobj.start();
		cobj.stop();
	}

}
