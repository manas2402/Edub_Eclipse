package AdvanceTopics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class readDataFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\PC-DELL\\git\\repository\\EBPracticals\\resources\\write.txt";
		String data = "this is manas file";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path)))
		{
			bw.write(data);
			bw.newLine();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
			
		}
		System.out.println("Files(s) Created");
	}

}
