package nl.kingcrafting.generalAPI;

import nl.kingcrafting.generalAPI.tools.io.FileTools;
import nl.kingcrafting.generalAPI.tools.string.StringTools;

public class GeneralAPI {

	public GeneralAPI() {
		init();

	}
	//test
	private FileTools fileTools = new FileTools();
	private StringTools strignTools = new StringTools();

	private synchronized void init() {

	}

	FileTools getFileTools() {
		return this.fileTools;
	}

	StringTools getStringTools() {
		return this.strignTools;
	}
}
