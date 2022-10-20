
public class ArrayAssignment1 {

	public static void main(String[] args) {
		
		//initialize values array of doubles
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 
							17, 123.145, 125.6, 123.146};
		
		//initialize holder for largest element in array
		double maxValue = 0;
		//initialize counter to count negative elements
		int negativeCounter = 0;
		
		//enhanced for loop to run through all array elements
		for(double element : values)
		{
			//print each array element in one line
			System.out.print(element + " ");
			
			//if the element is larger than the max, make it the new max
			if(element > maxValue)
			maxValue = element;
			
			//if the element is negative, add 1 to the negative counter
			if(element <0)
			negativeCounter += 1;

		} //end of enhanced for loop
		
		//print outputs
		System.out.println();
		System.out.println("The largest element in the array is "+ maxValue);
		System.out.println("There are "+negativeCounter+" negative numbers"
							+ " in the array");
		
	}
}
