/**
   An instructor is represented by a name, a birth year, and a salary.
   You must enter the class name, instance variable(s), and constructor below
*/
public class Instructor extends Person{

	//instance variable
	private double salary;
	
	//constructor
	public Instructor(String n, int by, double s)
	{
		//call Person constructor for common instance variables
		super(n, by);
		salary = s;
	}

   /**
      Returns the string representation of the object.
      @return a string representation of the object
   */
   public String toString()
   {
      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
   }
}