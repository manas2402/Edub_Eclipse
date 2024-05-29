package Arrays;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[5];
		
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;
		
		System.out.println("length of the array: "+ myArray.length);
		
		for(int i =0; i<myArray.length;i++) {
			System.out.println("Array Value : " + myArray[i]);
		}
		String [] fruits = { "apple", "mango", "kiwi" };
		
		//System.out.println(fruits[1]);
		
		//simple for loop
//		for(int i=0;i<fruits.length;i++)
//			System.out.println(fruits[i]);
		
		//enhanced for loop
		for(String fruit : fruits) {
			System.out.println(fruit);}
		
		int[] nums = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(nums).sum();

        System.out.println(sum);
        

	}

}
