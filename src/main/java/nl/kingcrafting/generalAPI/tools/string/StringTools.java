package nl.kingcrafting.generalAPI.tools.string;

import java.io.File;
import java.io.IOException;

import nl.kingcrafting.generalAPI.tools.io.FileTools;

public class StringTools {

	public StringTools() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public static String readStringFromFile(File file) throws IOException{
		return FileTools.readStringFromFile(file);
		
	}
	

}
