package inheritance;


class main
{
	main()
	{
		System.out.println("main class subconstructor");

	}
}
class sub extends main
{
	sub()
	{
		System.out.println("this is a sub class constructor");

	}
}
public class ConstructorInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub sobj = new sub();
//		sobj.sub();
	}

}
