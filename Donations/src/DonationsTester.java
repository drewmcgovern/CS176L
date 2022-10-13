import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException
	{
		
		//object for file
		File fileObj = new File("Donations.txt");
		//object for file scanner
		Scanner fileReader = new Scanner(fileObj);
		//object for console reader
		Scanner keyboard = new Scanner(System.in);
		//object for donations class
		Donations giveToMe = new Donations();
		
		//ask the user if they want to process donations file
		System.out.print("Would you like to process donations now? (Enter 'Yes' to continue): ");
		String answer = keyboard.nextLine();
		System.out.println();
		
		//if their answer is yes, read the file and output the results
		if(answer.toLowerCase().equals("yes"))
		{
			while(fileReader.hasNextLine()) //while there are lines left
			{
				String line = fileReader.nextLine(); //read line
				
				if(line.equals("<EOF>")) //end while loop if sentinel value
				{
					break;
				}
				else //if not sentinel value
				{
					//extract double from line
					String numLine = line.replaceAll("[^-0-9.]","");
					double num = Double.parseDouble(numLine);
					
					//check what type of donation the line is
					//then send corresponding info to processDonation
					if(line.startsWith("<individual"))
					{
						giveToMe.processDonation("individual", num);
					}
					else if(line.startsWith("<business"))
					{
						giveToMe.processDonation("business", num);
					}
					else if(line.startsWith("<other"))
					{
						giveToMe.processDonation("other", num);
					}
				}
			}
			
			//close the file scanner
			fileReader.close();
			//close the console scanner
			keyboard.close();
			//print the file statistics
			giveToMe.getStatistics();
		}
		else
		{
			//print if user input.toLowerCase != "yes"
			System.out.println("Ending now without processing donations.");
		}
	}
}
