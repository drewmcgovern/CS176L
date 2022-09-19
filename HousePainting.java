import java.util.Scanner;
public class HousePainting {
	
	public static void main(String[] args) {
		//Create an object for the scanner
		Scanner sc = new Scanner(System.in);
		
		//Ask for all necessary inputs from the user
		System.out.print("Please enter the cost per square foot: ");
		double costPerSqFt = sc.nextDouble();
		
		System.out.print("Please enter the length of the house: ");
		double houseLength = sc.nextDouble();
		
		System.out.print("Please enter the width of the house: ");
		double houseWidth = sc.nextDouble();
		
		System.out.print("Please enter the height of the house: ");
		double houseHeight = sc.nextDouble();
		
		System.out.print("Please enter the number of windows: ");
		double numOfWindows = sc.nextDouble();
		
		System.out.print("Please enter the length of a window: ");
		double windowLength = sc.nextDouble();
		
		System.out.print("Please enter the width of a window: ");
		double windowWidth = sc.nextDouble();
		
		System.out.print("Please enter the number of doors: ");
		double numOfDoors = sc.nextDouble();
		
		System.out.print("Please enter the length of a door: ");
		double doorLength = sc.nextDouble();
		
		System.out.print("Please enter the width of a door: ");
		double doorWidth = sc.nextDouble();
		
		//Close the scanner
		sc.close();
		
		//Do necessary calculations in order to calculate paintable area and cost
		double normalSide = houseLength * houseWidth;
		double peakSide = ((0.5)*(houseLength*(houseHeight-houseWidth)))+normalSide;
		double totalWindowArea = numOfWindows*windowLength*windowWidth;
		double totalDoorArea = numOfDoors*doorLength*doorWidth;
		double totalHouseArea = (2*normalSide)+(2*peakSide);
		double totalPaintableArea = totalHouseArea - totalWindowArea - totalDoorArea;
		double costToPaint = totalPaintableArea * costPerSqFt;
		
		System.out.printf("Your total paintable surface area is: %,.2f", totalPaintableArea);
		System.out.println(" ft"); //on the end of the previous line
		System.out.printf("Your estimate is: $%,.2f", costToPaint);
		
	}

}
