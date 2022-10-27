//Andrew McGovern
//Arizona Reynoso
//Zakariya Ahmed

import java.util.ArrayList;

public class medals {

	public static void main(String[] args) {
		
	ArrayList<String> country = new ArrayList<String>();
	country.add("Canada");
	country.add("Italy");
	country.add("Germany");
	country.add("Japan");
	country.add("Kazakhstan");
	country.add("Russia");
	country.add("South Korea");
	country.add("United States");
	country.add("Total");
	
	
	ArrayList<Integer> gold = new ArrayList<Integer>();
	gold.add(0); //Canada
	gold.add(0); //Italy
	gold.add(0); //Germany
	gold.add(1); //Japan
	gold.add(0); //Kazakhstan
	gold.add(3); //Russia
	gold.add(0); //South Korea
	gold.add(1); //United States
	int goldTotal = 0;
	for(int element : gold)
	{ goldTotal += element; }
	gold.add(goldTotal); //Total
	
	
	ArrayList<Integer> silver = new ArrayList<Integer>();
	silver.add(3); //Canada
	silver.add(0); //Italy
	silver.add(0); //Germany
	silver.add(0); //Japan
	silver.add(0); //Kazakhstan
	silver.add(1); //Russia
	silver.add(1); //South Korea
	silver.add(0); //United States
	int silverTotal = 0;
	for(int element : silver)
	{ silverTotal += element; }
	silver.add(silverTotal); //Total
	
	
	ArrayList<Integer> bronze = new ArrayList<Integer>();
	bronze.add(0); //Canada
	bronze.add(1); //Italy
	bronze.add(1); //Germany
	bronze.add(0); //Japan
	bronze.add(1); //Kazakhstan
	bronze.add(1); //Russia
	bronze.add(0); //South Korea
	bronze.add(1); //United States
	int bronzeTotal = 0;
	for(int element : bronze)
	{ bronzeTotal += element; }
	bronze.add(bronzeTotal); //Total
	
	
	ArrayList<Integer> countryTotal = new ArrayList<Integer>();
	for(int i = 0; i < country.size(); i++) //for each country
	{
		//set total to 0 for country i
		int tempTotal = 0;
		//add gold, silver, and bronze at country i
		tempTotal = gold.get(i) + silver.get(i) + bronze.get(i);
		//add total to countryTotal ArrayList
		countryTotal.add(tempTotal);
	}
	
	
	ArrayList<ArrayList> medalCount = new ArrayList<ArrayList>();	
	medalCount.add(country);
	medalCount.add(gold);
	medalCount.add(silver);
	medalCount.add(bronze);
	medalCount.add(countryTotal);

	
	//Print the titles of the table
	System.out.format("%14s%14s%14s%14s%14s",
			"Country", "Gold", "Silver", "Bronze", "Total");
	//Print out a new line
	System.out.println();
	
	//x represents each country's matching index position
	for (int x = 0; x < country.size(); x++)
	{
		//y represents each arraylist
		//(country, gold, silver, bronze, total)
		//inside the 2D arraylist
		for(int y = 0; y < medalCount.size(); y++)
		{
			//get(y) gets (country, gold, silver, bronze, total) arrays
			//get(x) gets the corresponding item in each of those
				//for the current country being written
			System.out.format("%14s",
					medalCount.get(y).get(x));
		}
		//move on to the next line
		System.out.println();
	}

	}
	
}
	
	
