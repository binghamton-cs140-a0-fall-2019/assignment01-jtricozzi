package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
	  DateAndPlaceOfBirth personInfo = new DateAndPlaceOfBirth(1999, 11, 30, "Schenectady", "NY", "USA");
	  StreetUSAddress myAddress = new StreetUSAddress("512 Acre Drive", "Apt 5", "Schenectady", "NY", "12303");
	  Person John = new Person("John", "Tricozzi", "123456789", personInfo, myAddress);
	  ComputerOwner Myself = new ComputerOwner(John);
	  Computer firstComputer = new Computer("Asus", "8 Cores", 8, 256, false, 250.0);
	  Computer secondComputer = new Computer("Acer", "8 Cores", 4, 500, true, 500.0);
	  Computer thirdComputer = new Computer("Dell", "4 Cores", 8, 1500, true, 550.0);
	  Computer lastComputer = new Computer("HP", "4 Cores", 2, 1250, false, 600.0);
	  Myself.addComputer(firstComputer);
	  Myself.addComputer(secondComputer);
	  Myself.addComputer(thirdComputer);
	  Myself.addComputer(lastComputer);
	  System.out.print(Myself);
	  Myself.removeComputer(0);
	  Myself.removeComputer(0);
	  System.out.println(Myself);
	  
	  
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwnerTester.java:");
         
		 DateAndPlaceOfBirth personInfo2 = new DateAndPlaceOfBirth(1999, 11, 30, "Schenectady", "NY", "USA");
	     StreetUSAddress myAddress2 = new StreetUSAddress("512 Acre Drive", "Apt 5", "Schenectady", "NY", "12303");
	     Person John2 = new Person("John", "Tricozzi", "123456789", personInfo2, myAddress2);
         ComputerOwner Myself2 = new ComputerOwner(John2);
	     Computer firstComputer2 = new Computer("Asus", "8 Cores", 8, 256, false, 250.0);
	     Computer secondComputer2 = new Computer("Acer", "8 Cores", 4, 500, true, 500.0);
	     Computer thirdComputer2 = new Computer("Dell", "4 Cores", 8, 1500, true, 550.0);
	     Computer lastComputer2 = new Computer("HP", "4 Cores", 2, 1250, false, 600.0);
	     Myself.addComputer(firstComputer2);
   	     Myself.addComputer(secondComputer2);
	     Myself.addComputer(thirdComputer2);
	     Myself.addComputer(lastComputer2);
	     System.out.print(Myself2);
	     Myself.removeComputer(0);
	     Myself.removeComputer(0);
	     output.println(Myself2);
		 
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	  
	 
		}
	}