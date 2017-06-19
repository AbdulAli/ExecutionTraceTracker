package cleanLogFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CalculateClassCoverage {

	static String[] sourcePaths = { "QKSMS-2.1.0\\", "QKSMS-2.2.0\\",
			"QKSMS-2.2.1\\", "QKSMS-2.2.2\\", "QKSMS-2.2.5\\",
			"QKSMS-2.3.1\\", "QKSMS-2.4.0\\", "QKSMS-2.4.1\\",
			"QKSMS-2.5.0\\", "QKSMS-2.5.1\\", "QKSMS-2.5.2\\",
			"QKSMS-2.5.3\\", "QKSMS-2.5.4\\", "QKSMS-2.5.5\\",
			"QKSMS-2.6.0\\", "QKSMS-2.6.1\\", "QKSMS-2.6.2\\",
			"QKSMS-2.6.3\\", "QKSMS-2.7.0\\", "QKSMS-2.7.1\\",
			"QKSMS-2.7.2\\", "QKSMS-2.7.3\\" };

	static String[] fileNames = { "_-tc1CK.csv", "_-tc2CK.csv", "_-tc3CK.csv",
			"_-tc4CK.csv", "_-tc5CK.csv" };
	
	static String directory = "C:\\Users\\AbdulAli\\Desktop\\Metrics Values_CK+Martin+Frequencies\\";


	public static void main(String[] args) throws IOException {
		
		String sourcePath = directory + sourcePaths[0];
		
		String filePathCK = sourcePath + "CK.csv";
		
		HashMap<String,Boolean> CKs = new HashMap<String,Boolean>(0);
		
		BufferedReader reader = new BufferedReader(new FileReader(filePathCK));
		String line;
		while ((line = reader.readLine()) != null) {
			CKs.put(line.split(",")[0], new Boolean(false));
		}
		reader.close();
		
		for(String file: fileNames){
			String tcFile = sourcePath + file;
			BufferedReader r = new BufferedReader(new FileReader(tcFile));
			while ((line = reader.readLine()) != null) {
				CKs.put(line.split(",")[0], new Boolean(true));
			}
			reader.close();
		}
	
	}
}
