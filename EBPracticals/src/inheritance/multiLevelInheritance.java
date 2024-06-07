package inheritance;
class human{
	public void walks() {
		System.out.println("walking....");

	}
}
class Manas extends human
{
	public void run() {
		System.out.println("he is running");

	}
}

class Tripathi extends Manas
{
	public void runfaster() {
		System.out.println("He is running for his life");

	}
}
public class multiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tripathi t = new Tripathi();
		
		t.walks();
		t.run();
		t.runfaster();
		
	}

}
