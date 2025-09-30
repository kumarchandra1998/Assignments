package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class HelloWorld {
 // This is a main method and always JVM begins execution from main method 
	
	// three main types of comments
	//1. Single-line Comment -> Starts with //
	//2. Multi-line Comment -> Starts with /* and ends with */
	//3. Documentation Comment -> it starts with /** and ends with */
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub (Comment in java )
		//Prints text without a newline at the end.
		System.out.print("Hello");
		System.out.print(" World!\n");
   
		//Prints text with a newline at the end.
		System.out.println("Hello World!");
		System.out.println("Java");
		
		//Functions similarly to printf but more explicitly named for formatting.
		System.out.printf("Hello , %S What is your age %d , Do you have passport ? %b.\n ", "Kumar", 27 , true);
		
		//Print error messages separately from standard output.
		System.err.print("This line is an error\n");
		
		//Java Logging Frameworks: For advanced logging.
		Logger logger = Logger.getLogger("Sample logs");
		logger.info("Currenlty line 31 is executing");
		logger.warning("There is a warning messaing is line 32");
		
		//Print & Export the messages into text file.
		PrintWriter logs = new PrintWriter("C:\\AutomationTraining\\JavaTraining\\Logs.txt");
		logs.println("currently line 38 is prinitng");
		logs.println("currently line 39 is prinitng");
		logs.close();
		

	}

}
