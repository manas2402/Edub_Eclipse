package StaticDemo;

class staticVarDemo{
	static int staticX = 1000;
	private int x;
	
	public void printVal(int i) {
		x=i;
		staticX = 2000;
		System.out.println("non static x: " +x);
		System.out.println("Static x: "+ staticX);
		//System.out.println("Memory loc Address: "+ s);
		System.out.println("---------------");
	}
}

public class staticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVarDemo e1 = new staticVarDemo();
		staticVarDemo e2 = new staticVarDemo();
		staticVarDemo e3 = new staticVarDemo();
		staticVarDemo.staticX = 30000;
		e1.printVal(10);
		e2.printVal(20);
		e3.printVal(30);
	}

}
