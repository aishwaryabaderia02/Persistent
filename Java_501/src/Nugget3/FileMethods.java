package Nugget3;

import java.io.File;

public class FileMethods {
	public static void main(String[] args) {
		String path = "C:\\Users\\Aishwarya\\git\\Persistent\\abcd";
		FileMethods fm = new FileMethods();
		fm.displayFolderContents(path);
	}
	public void displayFolderContents(String path) {
		File file = new File(path);
		if (file.isDirectory())
		{
			
			for(String fi : file.list()) {
				System.out.println(fi);
				displayFolderContents("C:\\Users\\Aishwarya\\git\\Persistent\\abcd\\"+ fi);
			}
		}
		else {
			if(file.isFile())
			{
			System.out.println(file.getName());
			}
		}
	}
	
}
