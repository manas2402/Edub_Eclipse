package Assignment6_29_05_24;

import java.util.*;

class SumCalculator {
    private int num1;
    private int num2;
    private int sum;

    // Constructor to initialize the numbers and calculate the sum
    public SumCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = num1 + num2;
    }

    // Method to get the sum
    public int getSum() {
        return sum;
    }
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first number: ");
		Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        // Prompting the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Creating an instance of SumCalculator
        SumCalculator calculator = new SumCalculator(num1, num2);

        // Printing the sum
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + calculator.getSum());
        
        // Closing the scanner
        scanner.close();
	}

}
