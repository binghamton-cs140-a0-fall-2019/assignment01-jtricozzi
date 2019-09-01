package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
	  
	  SimpleDate myDate = SimpleDate.of(1999,11,30);
	  SimpleDate yourDate = SimpleDate.of(1999,11,29);
	  System.out.println(myDate);
	  System.out.println(myDate.before(yourDate));
	  
	  
	  
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");
         
	  SimpleDate myDate2 = SimpleDate.of(1999,11,30);
	  SimpleDate yourDate2 = SimpleDate.of(1999,11,29);
	  output.println(myDate2);
	  output.println(myDate2.before(yourDate2));
	  
		 
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	  
	 
		}
	}