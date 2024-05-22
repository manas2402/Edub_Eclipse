import java.util.Scanner;

public class Assignment_20_05_2024 {
	
	public enum Day{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		Given_Wrong_Number
	}

	public static void main(String[] args) {
		//Question 1
		System.out.print("Enter a number/age : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(" ");
		System.out.println("Question 1 answer : ");
		if(n % 2 == 0 ) {
			System.out.println("The number " + n + " is even number");
		}else {
			System.out.println("The number " + n + " is odd number");
		}
		
		//Question 3
		System.out.println(" ");
		System.out.println("Question 3 answer : ");
		boolean isPrime = true;
		int i = 2;
		while (i <= n / 2) {
            if (n % i == 0) {
                // If divisible, it's not prime
                isPrime = false;
                break;
            }
            ++i;
        }
        if(isPrime){
            System.out.println(n + " is a prime number.");}
        else{
            System.out.println(n + " is not a prime number.");}
		
        //Question 4
        System.out.println(" ");
        System.out.println("Question 4 answer : ");
		if(n == 0 || n == 1) {
			System.out.println(n + " age is an infant");}
		else if(n == 2 || n ==3) {
			System.out.println(n + " age is a Toddler");}
		else if(n >= 4 && n <=12 ) {
			System.out.println(n + " age is a Child");}
		else if(n >= 13 && n <=19 ) {
			System.out.println(n + " age is a Teenager");}
		else if(n >= 20 && n <=64 ) {
			System.out.println(n + " age is an Adult");}
		else if(n >= 65) {
			System.out.println(n + " age is a Senior");}
		else {
			System.out.println(n + " is Not born or has died");}
		
		//Question 6
		System.out.println(" ");
        System.out.println("Question 6 answer : ");
        System.out.print("Enter a number once again between 1 to 7 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Day day = null;
		switch (num) {
		case 1:
            day = Day.MONDAY;
            break;
        case 2:
            day = Day.TUESDAY;
            break;
        case 3:
            day = Day.WEDNESDAY;
            break;
        case 4:
            day = Day.THURSDAY;
            break;
        case 5:
            day = Day.FRIDAY;
            break;
        case 6:
            day = Day.SATURDAY;
            break;
        case 7:
            day = Day.SUNDAY;
            break;
        default:
        	day = Day.Given_Wrong_Number;
		}
		System.out.println("Day of the week: " + day);	
	}

}
