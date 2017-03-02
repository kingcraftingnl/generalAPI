package nl.kingcrafting.generalAPI.tools.string;

import java.io.File;
import java.io.IOException;

import nl.kingcrafting.generalAPI.tools.generalObject;
import nl.kingcrafting.generalAPI.tools.io.FileTools;

public class StringTools extends generalObject{
	
	private static FileTools ft = new FileTools();

	public StringTools() {

	}

	@SuppressWarnings("static-access")
	public static String readStringFromFile(File file) throws IOException
	{
		return ft.readStringFromFile(file);
	}
	
	

	

}
