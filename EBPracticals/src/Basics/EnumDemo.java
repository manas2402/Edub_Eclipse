package Basics;

public class EnumDemo {
	
	public enum day{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		FRIDAY,
		SATURDAY
	}
	public enum status{
		eligible,
		not_eligible,
		no_status
	}
	public static void main(String[] args) 
	{
		day today = day.MONDAY;
		day day_after_tomorrow = day.valueOf("WEDNESDAY");
		status s1 = status.not_eligible;
		System.out.println("Today is : " + today);
		System.out.println("Day After Tomorrow is : " + day_after_tomorrow);
		System.out.println("Student s1 : " + s1);
	}

}
