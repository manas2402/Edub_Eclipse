package Arrays;

public class jaggedArrayDemo {
	
	public static void main(String args[]) {
		
	int[][] jaggedArray = {
			new int[] {1,2},
			new int[] {3,4,5},
			new int[] {6}
	};
	
	
//	jaggedArray = new int[3][];
//	jaggedArray[0] = new int[2];
//	jaggedArray[1] = new int[3];
//	jaggedArray[2] = new int[1];
	
	System.out.println("array value : " + jaggedArray[1][1]);
	System.out.println("array value : " + jaggedArray[2][0]);
	}
}
