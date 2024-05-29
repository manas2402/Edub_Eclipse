package Arrays;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiArray[][] = new int[2][2];
		multiArray[0][0] = 10;
		multiArray[0][1] = 20;
		multiArray[1][0] = 30;
		multiArray[1][1] = 40;
		
		System.out.println("length of the array: "+ multiArray.length);
		
		for(int i =0; i<multiArray.length;i++) {
			for(int j =0; j<multiArray.length;j++) {
			System.out.println("Array Value : " + multiArray[i][j]);
			}
			}
		int multiArray1[][] = {{1,2},{3,4}};
		for(int i =0; i<multiArray1.length;i++) {
			for(int j =0; j<multiArray1.length;j++) {
			System.out.println("Array Value : " + multiArray1[i][j]);
			}
			}
	}
		

}
