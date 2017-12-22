package st085564.files.creation;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		// Directories path
		String fileFirstPathFull = "C:\\Users\\Rosario\\Desktop\\full\\first.bat";
		String fileSecondPathFull = "C:\\Users\\Rosario\\Desktop\\full\\second.bin";
		String fileFirstPathNested = "C:\\Users\\Rosario\\Desktop\\full\\nested\\first.csv";

		// Files 
		File fileFirstFull = new File(fileFirstPathFull);
		File fileSecondFull = new File(fileSecondPathFull);
		File fileFirstNested = new File(fileFirstPathNested);

		try {
			
			// Files creation
			fileFirstFull.createNewFile();
			System.out.println("File \'first.bat\' is created");
			fileSecondFull.createNewFile();
			System.out.println("File \'second.bin\' is created");
			fileFirstNested.createNewFile();
			System.out.println("File \'first.csv\' is created");
			
			// Control on creation
			System.out.println("All files are created successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
