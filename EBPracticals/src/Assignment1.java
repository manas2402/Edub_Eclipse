import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
//		int i = 4;
//		int j = 0;
////		while(j <= i) {
////			System.out.println("Manas");
////			j++;
////		}
//		for(j=0;j<=i;j++){
//			System.out.println("Manas");
//			}
//		int a = 10;
//		int b = 10;
//		int sum = a + b;
//		System.out.println(sum);
//		System.out.println("Enter a number");
//		Scanner sc = new Scanner(System.in);
//		int f = sc.nextInt();
//		System.out.println("Enter one more number");
//		Scanner sn = new Scanner(System.in);
//		int g = sn.nextInt();
//		int add = f +g;
//		System.out.println(add);
		Scanner scanner = new Scanner(System.in);

        // Input: Basic Salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Variables to hold HRA and DA values
        double hra = 0;
        double da = 0;

        // Calculate HRA and DA based on the given rules
        if (basicSalary <= 10000) {
            hra = 0.20 * basicSalary;
            da = 0.80 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.90 * basicSalary;
        } else {
            hra = 0.30 * basicSalary;
            da = 0.95 * basicSalary;
        }

        // Calculate the total salary
        double totalSalary = basicSalary + hra + da;

        // Output the total salary
        System.out.println("Total Salary: " + totalSalary);
        
        scanner.close();
		
		
	}

}
