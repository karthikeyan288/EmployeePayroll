package com.File_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PayRollServices {
	private static final String HOME ="IOExample/text.txt";
	
	public static void main(String[] args) throws IOException  {
		Path path =Paths.get(HOME);
		Files.deleteIfExists(path);
		boolean check= Files.exists(path);
		System.out.println(check);
		if(check==false) {
			Files.createDirectory(path);
		}
		
		//creating files
		Path homePath = Paths.get(HOME);
			Files.exists(homePath);
			try {
				Files.createFile(homePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		for (Path path2 : homePath) {
			System.out.println(path2);
		}	
	}

}
