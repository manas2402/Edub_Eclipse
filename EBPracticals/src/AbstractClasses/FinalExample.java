package AbstractClasses;

class bikes
{
	private final int speed_limit = 6900;
	
	public void run()
	{
		//speed_limit = 400;
		System.out.println("speed limit is : "+speed_limit);

	}
}
public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bikes bobj = new bikes();
		bobj.run();
	}

}
