package AbstractClasses;

class bikee
{
	private final int speed_limit = 100;
	
	final public void run()
	{
		System.out.println("spee limit : "+speed_limit);

	}
}

class hondaa extends bikee
{
	public void runn()
	{
		System.out.println("honda is running");

	}
}
public class selaedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bikee bobj = new bikee();
		bobj.run();
	}

}
