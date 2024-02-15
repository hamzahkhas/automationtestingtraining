package daytwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
	public static void main(String [] args) {
		String file = "C:\\Users\\USER\\Downloads\\readfiles.txt";
		
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			String line;
			System.out.println("Contents of the file:-\n");
			while ((line = buffReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.println("Error reading file: "+e.getMessage());
		}
	}
}
