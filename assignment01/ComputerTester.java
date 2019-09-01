package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
        Computer firstComputer = new Computer("Asus", "8 Cores", 8, 256, false, 250.0);
		Computer secondComputer = new Computer("Acer", "8 Cores", 4, 500, true, 500.0);
		Computer thirdComputer = new Computer("Dell", "4 Cores", 8, 1500, true, 550.0);
		Computer lastComputer = new Computer("HP", "4 Cores", 2, 1250, false, 600.0);
		System.out.println(firstComputer);
		System.out.println(secondComputer);
		System.out.println(thirdComputer);
		System.out.println(lastComputer);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		Computer firstComputer2 = new Computer("Asus", "8 Cores", 8, 256, false, 250.0);
		Computer secondComputer2 = new Computer("Acer", "8 Cores", 4, 500, true, 500.0);
		Computer thirdComputer2 = new Computer("Dell", "4 Cores", 8, 1500, true, 550.0);
		Computer lastComputer2 = new Computer("HP", "4 Cores", 2, 1250, false, 600.0);
		output.println(firstComputer);
		output.println(secondComputer);
		output.println(thirdComputer);
		output.println(lastComputer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}