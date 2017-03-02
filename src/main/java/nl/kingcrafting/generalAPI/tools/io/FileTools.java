package nl.kingcrafting.generalAPI.tools.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import nl.kingcrafting.generalAPI.ObjectType;
import nl.kingcrafting.generalAPI.tools.generalObject;

public class FileTools extends generalObject {

	public FileTools() {
		setId(1);
		setName("File Utils");
		setType(ObjectType.FILE);

	}

	public static void createFile(String dir, String filename) {
		File f = new File(dir + filename);
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("Error while creating file " + filename);
		}
	}

	public static String readStringFromFile(File file) throws IOException {

		StringBuilder fileContents = new StringBuilder((int) file.length());
		Scanner scanner = new Scanner(file);
		String lineSeparator = System.getProperty("line.separator");

		try {
			while (scanner.hasNextLine()) {
				fileContents.append(scanner.nextLine() + lineSeparator);

			}
			return fileContents.toString();
		} finally {
			scanner.close();
		}
	}

	public static File geFile(String file) throws IOException {
		return new File(file);
	}

	public static void deleteFile(File file) throws IOException {
		file.delete();
	}

	public static void writeToFile(File file, String text) throws IOException {
		BufferedWriter output = null;
		try {

			output = new BufferedWriter(new FileWriter(file));
			output.write(text);
		} catch (IOException e) {
			System.out.println("Error while Writing to file with txt:" + text + "To" + file.getAbsolutePath());
		} finally {
			if (output != null) {
				output.close();
			}
		}

	}

	public static void renameFile(File file, String newName) {
		file.renameTo(new File(newName));

	}

}
