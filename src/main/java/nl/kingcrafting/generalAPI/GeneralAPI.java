package nl.kingcrafting.generalAPI;

import nl.kingcrafting.generalAPI.tools.io.FileTools;

public class GeneralAPI {
	
	
	

	public GeneralAPI(){
		init();
		
	}
	public static String Message = "General API: ";
	public static FileTools fileTools = new FileTools();
	public static String ignoreThis = "Ignore Me.";
	
	public static String getMessage(){
		
		return Message;
	}
	
	private synchronized void init(){
		
		
		
	}
	
	
	
}