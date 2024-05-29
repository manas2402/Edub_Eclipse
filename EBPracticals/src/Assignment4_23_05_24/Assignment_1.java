package Assignment4_23_05_24;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();; // Replace with your desired number
		        int reverse = 0;

		        int originalNumber = number; // Store the original number

		        for (; number != 0; number /= 10) {
		            int digit = number % 10;
		            reverse = reverse * 10 + digit;
		        }

		        if (reverse == originalNumber) {
		            System.out.println("Number is a palindrome");
		        } else {
		            System.out.println("Number is not a palindrome");
		        }

	}

}
