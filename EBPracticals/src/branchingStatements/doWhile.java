package branchingStatements;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x=1;
		int fact =1;
		do {
			fact = fact*x;
			x++;
			
		}while(x<=n);
		System.out.println("Factorial of n: "+ fact);
		int y;
		//Dowhiledemo
		y=11;
		
		do
		{
			System.out.println("value of x: " +y);
			y++;
			
		}while(y<=10);
		
		System.out.println("it is out of the loop");
	}

}
