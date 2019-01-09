package javaproblemsolution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadandWritedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		{
		File dir = new File(".");
		 
		String source = "D:\\H1B\\Code.txt";
		String dest = "D:\\H1B\\Dest.txt";
 
		File fin = new File(source);
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
 
		FileWriter fstream = new FileWriter(dest, true);
		BufferedWriter out = new BufferedWriter(fstream);
 
		String aLine = null;
		while ((aLine = in.readLine()) != null) {
			//Process each line and add output to Dest.txt file
			out.write(aLine);
			out.newLine();
		}
 
		// do not forget to close the buffer reader
		in.close();
 
		// close buffer writer
		out.close();
	}
		 System.out.println("write succesfully");

	}

}
