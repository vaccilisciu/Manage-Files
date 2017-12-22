package st085564.files.creation;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {

		// Directories path
		String directoryPathEmpty = "C:\\Users\\Rosario\\Desktop\\empty";
		String directoryPathFull = "C:\\Users\\Rosario\\Desktop\\full";
		String directoryPathNested = "C:\\Users\\Rosario\\Desktop\\full\\nested";

		// Directories
		File directoryEmpty = new File(directoryPathEmpty);
		File directoryFull = new File(directoryPathFull);
		File directoryNested = new File(directoryPathNested);

		// Directories creation
		directoryEmpty.mkdir();
		System.out.println("Directory \'empty\' is created");
		directoryFull.mkdir();
		System.out.println("Directory \'full\' is created");
		directoryNested.mkdir();
		System.out.println("Directory \'nested\' is created");

		// Control on creation
		System.out.println("All directories are created successfully");
	}
}
