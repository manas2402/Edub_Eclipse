package branchingStatements;

public class switchDeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 3;
		String dayName;
		
		dayName = switch(day) {
		case 1,2,3,4,5 -> "Weekday";
		case 6,7 -> "Weekends";
		default -> "Invalid day";
		};
		System.out.print("The day seleceted is :" + dayName);
		int sum = 0;
        for (int i = 5; i >= 1; i--) {
            sum += i;
        }
        System.out.println("Sum of numbers from 5 to 1: " + sum);
	}

}
