package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
	public static void main(String[] args) {
	  DateAndPlaceOfBirth personInfo1 = new DateAndPlaceOfBirth(1990, 12, 6, "Schenectady", "NY", "USA");
	  DateAndPlaceOfBirth personInfo2 = new DateAndPlaceOfBirth(1990, 12, 6, "Binghamton", "NY", "USA");
	  DateAndPlaceOfBirth personInfo3 = new DateAndPlaceOfBirth(1970, 12, 6, "Detroit", "MI", "USA");
	  DateAndPlaceOfBirth personInfo4 = new DateAndPlaceOfBirth(1981, 2, 24, "London", "England");
	  DateAndPlaceOfBirth personInfo5 = new DateAndPlaceOfBirth(1999, 11, 30, "Paris", "France");
	  System.out.println(personInfo1);
	  System.out.println(personInfo2);
	  System.out.println(personInfo3);
	  System.out.println(personInfo4);
	  System.out.println(personInfo5);
	  System.out.println(personInfo1.olderThan(personInfo2));
	  System.out.println(personInfo1.olderThan(personInfo3));
	  System.out.println(personInfo1.olderThan(personInfo5));
	  System.out.println(personInfo1.youngerThan(personInfo2));
      System.out.println(personInfo1.youngerThan(personInfo3));
	  System.out.println(personInfo1.youngerThan(personInfo5));
	  System.out.println("should be true");
	  System.out.println(personInfo2.hasSameBirthDayAs(personInfo3));
	  System.out.println("should be true also");
	  System.out.println(personInfo1.hasSameBirthDayAs(personInfo3));
	  System.out.println(personInfo1.hasSameBirthDayAs(personInfo4));
	  System.out.println(personInfo1.hasSameBirthDayAs(personInfo5));
	  System.out.println(personInfo1.hasSameBirthDateAs(personInfo2));
	  System.out.println(personInfo1.hasSameBirthDateAs(personInfo3));
	  System.out.println(personInfo1.hasSameBirthDateAs(personInfo4));
	  System.out.println(personInfo1.hasSameBirthDateAs(personInfo5));
	  
	  
	  DateAndPlaceOfBirth personInfo12 = new DateAndPlaceOfBirth(1990, 12, 6, "Schenectady", "NY", "USA");
	  DateAndPlaceOfBirth personInfo22 = new DateAndPlaceOfBirth(1990, 12, 6, "Binghamton", "NY", "USA");
	  DateAndPlaceOfBirth personInfo32 = new DateAndPlaceOfBirth(1970, 12, 6, "Detroit", "MI", "USA");
	  DateAndPlaceOfBirth personInfo42 = new DateAndPlaceOfBirth(1981, 2, 24, "London", "England");
	  DateAndPlaceOfBirth personInfo52 = new DateAndPlaceOfBirth(1999, 11, 30, "Paris", "France");
	  
	  
	  try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

               output.println(personInfo12);
	  output.println(personInfo22);
	  output.println(personInfo32);
	  output.println(personInfo42);
	  output.println(personInfo52);
	  output.println(personInfo12.olderThan(personInfo22));
	  output.println(personInfo12.olderThan(personInfo32));
	  output.println(personInfo12.olderThan(personInfo52));
	  output.println(personInfo12.youngerThan(personInfo22));
      output.println(personInfo12.youngerThan(personInfo32));
	  output.println(personInfo12.youngerThan(personInfo52));
	  output.println(personInfo12.hasSameBirthDayAs(personInfo22));
	  output.println(personInfo12.hasSameBirthDayAs(personInfo32));
	  output.println(personInfo12.hasSameBirthDayAs(personInfo42));
	  output.println(personInfo12.hasSameBirthDayAs(personInfo52));
	  output.println(personInfo12.hasSameBirthDateAs(personInfo22));
	  output.println(personInfo12.hasSameBirthDateAs(personInfo32));
	  output.println(personInfo12.hasSameBirthDateAs(personInfo42));
	  output.println(personInfo12.hasSameBirthDateAs(personInfo52));

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	  
		}
	}