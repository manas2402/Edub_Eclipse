package Arrays;

public class stringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray; // Creation of the Array
		myArray = new int[5]; // allocating memory to an array
		
		int key=80, search=0;
		boolean found = false;
		//Assigning the value to an array
		myArray[0]= 10;
		myArray[1]= 20;
		myArray[2]= 30;
		myArray[3]= 40;
		myArray[4]= 50;
		
		System.out.println("length of the array: " +myArray.length);
		
		//iterating the values through the array
//		for(int i=0;i<myArray.length;i++)	
//		{
//		
//			if(myArray[i]==key) 
//			{
//				search=key;
//				if(search==key) {
//					System.out.println("Value found : " +search);}
//					else 
//					{	
//					System.out.println("Value not found : "+search);
//					}
//			}
//			else
//			search=0;
//		}
		for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                found = true;
                break; // Exit the loop if value is found
            }
        }
        if (found)
            System.out.println("Value found: " + key + " search key is : "+search);
        else
            System.out.println("Value not found: "+ key + " search key is : "+search);
	}

}
