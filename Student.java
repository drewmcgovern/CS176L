/**
   A student is represented by the name, birth year, and major.
   You must enter the class name, instance variable(s), and constructor below
*/
public class Student extends Person{

	//instance variable
	private String major;
	
	//constructor
	public Student(String n, int by, String m)
	{
		//call Person constructor for common instance variables
		super(n, by);
		major = m;
	}

   /**
      Returns the string representation of the object.
      @return a string representation of the object
   */
   public String toString()
   {
      return "Student[super=" + super.toString() + ",major=" + major + "]";
   }
}