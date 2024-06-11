package AdvanceTopics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadfileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\PC-DELL\\git\\repository\\EBPracticals\\resources\\SAMPLE.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String line;
			while((line=br.readLine())!=null);
			System.out.println(line);
			
		}
		catch(IOException e)
		{
			System.out.println(e);
			
		}
		System.out.println(" code needs to end here");
	}

}
