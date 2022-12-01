import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
      boolean fileFound = false; //allows to keep asking for file if not found
      
      while(fileFound == false) //loops until file is found
      {
    	  try {
    		  //create keyboard scanner for user input and ask for file path
    		  Scanner keyboard = new Scanner(System.in);
        	  System.out.println("Please enter the path to open "
        	  		+ "the input file for example "
        	  		+ "C:\\\\Downloads\\\\lines.txt : ");
        	  String inputFileName = keyboard.next();
        	  
        	  //input file object given the file address that was entered
        	  File inputFile = new File(inputFileName);
        	  //output file found in project file or created in project file
              PrintWriter outputFile = new PrintWriter("outlines.txt");
        	  
              //scanner for input file
              Scanner in = new Scanner(inputFile);
              //while there are remaining lines in the input file
              while (in.hasNext()) 
              {
              //get the line and send to output file
              String what = in.next();
              outputFile.println(what);
              }
              //close all the scanners
              in.close();
              outputFile.close();
              keyboard.close();
              
              //if you get to this point, the file must have been found
              //so set to true to stop the loop
              fileFound = true;
              System.out.println("Input file found, data sent to output file.");
          }

          catch(FileNotFoundException e)
          {
        	  System.out.println("File is not found, please try again");
          }
      }
 
      
   }
}
