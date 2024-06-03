package innerClass;

class outerClass{
	
	private String msg = "this is outer class";
	
	class innerClass{
		
		public void showMsg() {
			System.out.println(msg);

		}
	}
}
public class nonStaticInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerClass oobj = new outerClass();
		outerClass.innerClass iobj = oobj.new innerClass();
		
		iobj.showMsg();
	}

}
