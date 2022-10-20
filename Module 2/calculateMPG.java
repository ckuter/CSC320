import java.util.Scanner;

public class calculateMPG {

	public static void main(String[] args) {
		String carBrand;
		String carModel;
		String carYear;
		int startingOdometer;
		int endingOdometer;
		int gallonsConsumed;
		int milesDriven;
		int milesPerGallon;
		
		try (Scanner steve = new Scanner(System.in)) {
			System.out.print("Enter the vehicle's manufacturer: ");
			carBrand = steve.nextLine();
			
			System.out.print("Enter the vehicle's model: ");
			carModel = steve.nextLine();
			
			System.out.print("Enter the vehicle's model year: ");
			carYear = steve.nextLine();
			
			System.out.print("Enter the vehicle's starting odometer reading: ");
			startingOdometer = steve.nextInt();
			
			System.out.print("Enter the vehicle's ending odometer reading: ");
			endingOdometer = steve.nextInt();
			
			System.out.print("Enter the number of gallons consumed: ");
			gallonsConsumed = steve.nextInt();
		}
			
		milesDriven = endingOdometer - startingOdometer;
		milesPerGallon = milesDriven / gallonsConsumed;
		
		System.out.println();
		System.out.println("The vehicle's information is as follows: ");
		System.out.println("Make and Model: "+ carYear + " " + carBrand + " " + carModel);
		System.out.println("Starting odometer reading: " + startingOdometer);
		System.out.println("Ending odometer reading: " + endingOdometer);
		System.out.println("Gallons consumed: " + gallonsConsumed);
		System.out.println("MPG: " + milesPerGallon);

	}

}
