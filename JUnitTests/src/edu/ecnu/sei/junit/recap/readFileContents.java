package edu.ecnu.sei.junit.recap;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class readFileContents {
	
	public int processFile(String filename) throws IOException{
		FileInputStream stream = new FileInputStream(filename);
		BufferedReader bufRead = new BufferedReader(new InputStreamReader(stream));
		String line;
		while((line = bufRead.readLine())!=null) {
			System.out.println(line);
		}
	  return 1;
	}	

}
