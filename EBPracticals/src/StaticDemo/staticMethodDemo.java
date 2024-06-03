package StaticDemo;

class staticMethodExample2{
	static int code = 1001;
	int x;

	static{
		code=1005;
		
		System.out.println("static variable code : "+code);
	}
}


class staticMethodExample{
	static int code = 1001;
	int x;
	
	public void printX(int i) {
		x =i;
		System.out.println("x: " +x);
		System.out.println("static variable code : "+code);
	}
	
	public static void printStatic() {
		code=1005;
		
		System.out.println("static variable code : "+code);
		
	}
}

public class staticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethodExample e1 = new staticMethodExample();
		staticMethodExample e2 = new staticMethodExample();
		
		e1.printX(100);
		staticMethodExample.printStatic();
		
		e2.printX(200);
		staticMethodExample.printStatic();
		
		new staticMethodExample2();
		
	}

}
