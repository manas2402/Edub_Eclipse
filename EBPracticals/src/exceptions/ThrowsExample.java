package exceptions;

import java.io.*;

public class ThrowsExample {
	
	public static void readFile(String fileName) throws IOException
	{
		FileReader file = new FileReader(fileName);
		BufferedReader fileInput = new BufferedReader(file);
		
		System.out.println(fileInput.readLine());
		fileInput.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			readFile("test.txt");
		}
		catch(IOException s)
		{
			System.out.println("An error occurred:"+ s.getMessage());

		}
	}

}
