package inheritance;

class bank
{
	int acc_no;
	String acc_name;
	
	bank()
	{
		acc_no = 101;
		acc_name = "Manas";
	}
	public void display()
	{
		
		System.out.println(acc_no);
		System.out.println(acc_name);
	}
}

class trans extends bank
{
	public void display()
	{
		acc_no = 120;
		super.display();
		System.out.println(super.acc_no);
		System.out.println("display all the transactions");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trans tobj = new trans();
		tobj.display();
	}

}
