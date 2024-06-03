package Assignment_03_06_2024;

class college
{	
	public void disp()
	{		
		class students
		{		
			void MSG()
			{
				System.out.println("This is inner class students");
			}
		}
		students loc = new students();
		loc.MSG();
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		college cobj = new college();
		cobj.disp();
	}

}
