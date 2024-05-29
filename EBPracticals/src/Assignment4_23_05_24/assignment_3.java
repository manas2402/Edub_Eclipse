package Assignment4_23_05_24;

import java.util.Scanner;

public class assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number to see whether it is a prime or not : ");
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        if (num == 1) {
            System.out.println(num + " is not a prime number");
        } else if (num > 1) {
            // Check for factors
            for (int i = 2; i <= num / 2; ++i) {
                // Condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            // Check if flag is true
            if (!flag) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
	}

}
