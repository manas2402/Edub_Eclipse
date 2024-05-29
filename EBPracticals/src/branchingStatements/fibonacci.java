package branchingStatements;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Enter a number till you want fibonnaci series printed : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n + " Fibonacci Number: " + fib(n));
//		int i =0;
//		int j=1;
//		int k =1;
//		System.out.println(i+"\n"+j);
//		
//		do {
//			System.out.println(k);
//			i=j;
//			j=k;
//			k=i+j;
//					
//		}while(k<=range);
	}
		static int fib(int n)
	    {
	        if (n ==0)
	            return 0;
	        else if (n==1 || n==2)
	        	return 1;
	        return fib(n - 1) + fib(n - 2);
	    }

}
