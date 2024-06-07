package exceptions;

class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
	}
}
public class customExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(15);
		}
		catch(CustomException e)
		{
			System.out.println("CustomeException caught :"+ e.getMessage());

		}
	}
	
	public static void validate(int age) throws CustomException
	{
		if(age < 18)
		{
			throw new CustomException("Age is less than 10");
		}
		else
		{
			System.out.println("Age is valid");

		}
	}

}
