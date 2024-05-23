package Assignment3_22_05_24;

public class Question_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int k = 5; 

//        for(int i = 1; i <= k; i++) 
//        {  
//            for (int j = 1; j <= 5; j++) 
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
		int rows = 5; // Number of rows
        int columns = 5; // Number of columns

        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= columns) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
	}
	}

}
