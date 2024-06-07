package inheritance;

class parent
{
	public int show() 
	{
		int a = 4;
		int b = 6;
		System.out.println("it is a show method");
		System.out.println(a + b);
		return a + b;
		
	}
	public void design() 
	{
		System.out.println("it is a dsign");
	}
}
class child extends parent
{
	public void disp() 
	{
		System.out.println("it is a display");
	}
}
public class singleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child cobj = new child();
		
		cobj.disp();
		cobj.design();
		cobj.show();
	}

}
