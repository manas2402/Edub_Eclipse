package Assignment_03_06_2024;

interface colleges
{
	public void Students();
	public void Classes();
}

class twelfthClass implements colleges
{
	@Override
	public void Classes() {
		System.out.println("This is the result of class 12th");
	}
	@Override
	public void Students() {
		System.out.println("Aggregate percentage is 79.5%");
	}
}

class tenthClass implements colleges
{
	@Override
	public void Classes() {
		System.out.println("This is the result of class 10th");
	}
	@Override
	public void Students() {
		System.out.println("Aggregate percentage is 85.5%");
	}
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twelfthClass xii = new twelfthClass();
		tenthClass x = new tenthClass();
		
		xii.Classes();
		xii.Students();
		x.Classes();
		x.Students();
	}

}
