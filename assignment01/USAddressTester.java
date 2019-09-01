package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
	  StreetUSAddress personInfo1 = new StreetUSAddress("512 Acre Drive", "", "Schenectady", "NY", "12303");
	  StreetUSAddress personInfo2 = new StreetUSAddress("580 Acorn Street", "Apt 12", "Binghamton", "NY", "12085");
	  
	  System.out.println(personInfo1);
	  System.out.println(personInfo2);
	
	   try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR StreetUSAddress.java:");
      
	  StreetUSAddress personInfo12 = new StreetUSAddress("512 Acre Drive", "", "Schenectady", "NY", "12303");
	  StreetUSAddress personInfo22 = new StreetUSAddress("580 Acorn Street", "Apt 12", "Binghamton", "NY", "12085");
	  
	  output.println(personInfo12);
	  output.println(personInfo22);
	  
    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or System.out.println
    // by output.print or output.println
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
	}
	
}