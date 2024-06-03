package innerClass;

class outerClass2{
	//outer2(){
	public void display(){
	
		class localClass{
			
			void showMsg() {
				System.out.println("This is local msg");
			}
		}
		localClass loc = new localClass();
		loc.showMsg();
	}
//} this is used to call directly the constructor 
}

public class localInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerClass2 oobj = new outerClass2();
		oobj.display();
	}

}
