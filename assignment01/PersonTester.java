package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
	  DateAndPlaceOfBirth personInfo = new DateAndPlaceOfBirth(1999, 11, 30, "Schenectady", "NY", "USA");
	  StreetUSAddress myAddress = new StreetUSAddress("512 Acre Drive", "Apt 5", "Schenectady", "NY", "12303");
	  Person John = new Person("John", "Tricozzi", "123456789", personInfo, myAddress);
	  System.out.println(John);
	  
	  
	  
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");
         
		 DateAndPlaceOfBirth personInfo2 = new DateAndPlaceOfBirth(1999, 11, 30, "Schenectady", "NY", "USA");
	     StreetUSAddress myAddress2 = new StreetUSAddress("512 Acre Drive", "Apt 5", "Schenectady", "NY", "12303");
	     Person John2 = new Person("John", "Tricozzi", "123456789", personInfo2, myAddress2);
	     output.println(John2);
		 
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	  
	 
		}
	}