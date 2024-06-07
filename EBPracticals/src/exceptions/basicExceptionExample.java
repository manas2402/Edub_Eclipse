package exceptions;

public class basicExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x,y;
			x=100;
			y=0;
			
			int div = x/y;
			
			System.out.println("The result is : "+div);

		}
		catch(Exception e)
		{
			System.out.println("This feature is not working something..");

		}
		finally
		{
			System.out.println("the final block is xalled");

		}
		System.out.println("This is the end of programme");

	}

}
