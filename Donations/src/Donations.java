
public class Donations {

	private int numIndividual = 0;
	private double amtIndividual = 0;
	private int numBusiness = 0;
	private double amtBusiness = 0;
	private int numOther = 0;
	private double amtOther = 0;
	
	
	public void processDonation(String cat, double donation)
	{
		if(cat.equals("individual"))
		{
			amtIndividual += donation;
			if(donation > 0)
			numIndividual += 1;
			else //if donation negative
			numIndividual -= 1;
		}
		else if(cat.equals("business"))
		{
			amtBusiness += donation;
			if(donation > 0)
			numBusiness += 1;
			else //if donation negative
			numBusiness -= 1;
		}
		else if(cat.equals("other"))
		{
			amtOther += donation;
			if(donation > 0)
			numOther += 1;
			else //if donation negative
			numOther -= 1;
		}

	}
	
	public void getStatistics()
	{
		System.out.printf("Individual:   #: "+numIndividual+"   total: $%,.2f", amtIndividual);
		System.out.println();
		System.out.printf("Business:   #: "+numBusiness+"   total: $%,.2f", amtBusiness);
		System.out.println();
		System.out.printf("Other:   #: "+numOther+"   total: $%,.2f", amtOther);
	}

}
