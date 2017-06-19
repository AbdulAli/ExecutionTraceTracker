package executionPath;

import java.io.File;

import executionPath.resources.AndroidFile;

public class ExecutionPath {

	public static Resource resource;

	public static AndroidFile androidFile;

	public static void main(String[] args) {

		String projectPath = "C:\\PDFCreator-1.0.1\\PDFCreator-1.0.1\\app\\src\\";
		
		final File folder = new File(projectPath);

		Util utility = new Util();
		
		utility.runExecutionPathLogger(folder, resource, androidFile);
		
		System.out.println("======== Execution complete ==========");
	}
}
