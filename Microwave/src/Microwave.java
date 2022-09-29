
public class Microwave {

	private int seconds = 0;
	private int powerLevel = 1;
	
	/**
	Setter method
	Advances the value of seconds by 30
	*/
	public void time()
	{
		seconds = seconds + 30;
		System.out.println("Time Button was pressed. Time is "+seconds+" seconds.");
	}
	
	/**
	Setter method
	Swaps the value of powerLevel between 1 and 2
	*/
	public void power()
	{
		if(powerLevel == 1)
		{ powerLevel = 2; }
		else
		{ powerLevel = 1; }
		
		System.out.println("Power Button was pressed. Power level is "+powerLevel+".");
	}
	
	/**
	Setter method
	Resets the value of seconds to 0,
	and resets the value of powerLevel to 1
	*/
	public void reset()
	{
		seconds = 0;
		powerLevel = 1;
		
		System.out.println("Reset Button was pressed. "
						+ "Power level is "+powerLevel+". Time is "+seconds+" seconds.");
	}
	
	/**
	Getter method
	Starts the "cooking" at certain time and power level
	*/
	public void start()
	{
		System.out.println("Cooking for "+seconds+" seconds at level "+powerLevel+".");
	}
	
	
}
