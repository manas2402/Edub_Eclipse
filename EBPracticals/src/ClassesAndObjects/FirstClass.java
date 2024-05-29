package ClassesAndObjects;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 20;
		System.out.println(big(a,b));

		
	}	
	public static int big(int d, int e) {
//		if(d>e) {
//			return d;
//		}
//		else
//			return e;
		return (d>e)?d:e;
	}

}
