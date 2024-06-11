package LambdaDemo;


interface sum
{
	public int add(int a , int b);
}
public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum sobj = (int a, int b) -> a+b;
		
		System.out.println(sobj.add(10,20));

	}

}
