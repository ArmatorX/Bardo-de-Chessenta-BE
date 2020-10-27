package com.ArmatorX.BardodeChessentaBE.fileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class FileManager {
	public static final String archivo = "discord.cfg";

	public static String getTokenDiscord() {
		try {
			File myObj = new File(archivo);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				
				if (data.startsWith("token")) {
					data = data.replace("token=\"", "");
					data = data.replace("\";", "");
					return data;
				}
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return "";
	}
}
