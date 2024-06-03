package innerClass;

class outerClass1{
	
	private static String msg = "this is outer class";
	
	static class innerClass{
		
		public void showMsg() {
			System.out.println(msg);
		}
	}
}

public class staticInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerClass1.innerClass iobj = new outerClass1.innerClass();
		iobj.showMsg();
	}

}
