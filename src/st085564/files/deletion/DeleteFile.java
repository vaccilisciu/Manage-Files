package st085564.files.deletion;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {

		// Directories path
		String directoryEmptyPath = "C:\\Users\\Rosario\\Desktop\\empty";
		String directoryFullPath = "C:\\Users\\Rosario\\Desktop\\full";
		
		// Directories 
		File directoryEmpty = new File(directoryEmptyPath);
		File directoryFull = new File(directoryFullPath);

		try {
			
			// Directories recursively deletion 
			delete(directoryEmpty);
			System.out.println("Directory \'empty\' is deleted");
			delete(directoryFull);
			System.out.println("Directory \'full\' is deleted");
			
			// Control on creation
			System.out.println("All files are deleted successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Recursively deleting directories
	 * 
	 * @param directory Directory for deleting
	 * @throws IOException Error in path's definition
	 */
	private static void delete(File directory) throws IOException {

		for (File childFile : directory.listFiles()) {

			if (childFile.isDirectory()) {
				delete(childFile);
			} else {
				if (!childFile.delete()) {
					throw new IOException();
				}
			}
		}

		if (!directory.delete()) {
			throw new IOException();
		}
	}

}
