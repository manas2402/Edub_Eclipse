package Assignment3_22_05_24;

import java.util.Scanner;

public class Question_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
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
	}

}
