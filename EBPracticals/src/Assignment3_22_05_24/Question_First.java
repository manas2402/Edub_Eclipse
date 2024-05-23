package Assignment3_22_05_24;

import java.util.Scanner;

public class Question_First {

	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = rev(n,0);
		System.out.println(" ");
		System.out.println("Question 1 answer : ");
		if (temp == n)
			System.out.println("Yes it is a palindrome number");
		else
			System.out.println("No it is not a palindrome number" );
	}
	
	
	static int rev(int n, int temp)
	{
	
	if (n == 0)
	return temp;

	temp = (temp * 10) + (n % 10);

	return rev(n / 10, temp);
	}

}
