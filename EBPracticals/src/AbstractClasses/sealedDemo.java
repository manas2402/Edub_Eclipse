package AbstractClasses;

sealed interface  abc permits axis
{
	public void abcd();
}

sealed class bank permits axis
{
	public void setInterest()
	{
		System.out.println("Interest rate is 10%");

	}
}

//final class sbi extends bank
//{
//	
//}

non-sealed class axis extends bank implements abc
{
	public void setInterest()
	{
		System.out.println("interest rate is 25");

	}
	public void newInterest()
	{
		System.out.println("new interest rate is 37");

	}
	@Override
	public void abcd() {
		// TODO Auto-generated method stub
		
	}
}
public class sealedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		axis aobj = new axis();
		aobj.setInterest();
	}

}
