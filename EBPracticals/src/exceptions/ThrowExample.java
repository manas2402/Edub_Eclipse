package exceptions;

public class ThrowExample {
	
	static void checkAge(int age)
	{
		if(age<18) {
			throw new ArithmeticException("Access Denied - You must be 18 years old");
		}
		else {
			System.out.println("Access granted - you are old enough to juse this");

		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(15);
	}

}
