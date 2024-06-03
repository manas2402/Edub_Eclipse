package innerClass;

class annonymous1{
	
	public void showAnon()
	{
		System.out.println("show anon called");
	}
}

public class annonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		annonymous1 any = new annonymous1() {
			public void showAnon1() {
				System.out.println("show anon1 called");
			}
		};
		any.showAnon();
		new annonymous1().showAnon();
	}
}
