import java.util.Scanner;

public class inventoryProgram {
	
	public static void main(String[] args) {
		Automobile automobile = new Automobile();
		try (Scanner speak = new Scanner(System.in)) {
			System.out.println("Welcome to our vehicle inventory program!");
			System.out.println("");
		
			do {
				try {
					
					//below is the menu prompt to tell the user what they can do. 
					System.out.println("What do you want to do?");
					System.out.println("--------------------------------------------------------------");
					System.out.println("1. Add a new vehicle.");
					System.out.println("2. Remove an existing vehicle.");
					System.out.println("3. Update an existing vehicle.");
					System.out.println("4. View all our vehicles.");
					System.out.println("5. Print our entire vehicle inventory to a text file.");
					System.out.println("6. Exit the program.");
					System.out.println("--------------------------------------------------------------");
					System.out.println("");
					System.out.println("Enter the number of the action you wish to perform (1 to 6): ");	
					
					int menu = speak.nextInt();
					speak.nextLine();
					
					if (menu == 1) {
						System.out.println("");
						System.out.println("Please enter the information of the vehicle you would like to add.");
						
						System.out.println("Make: ");
						String make = speak.nextLine();
						
						System.out.println("Model: ");
						String model = speak.nextLine();
						
						System.out.println("Color: ");
						String color = speak.nextLine();
						
						System.out.println("Manufacturing Year: ");
						int year = speak.nextInt();
						speak.nextLine();
						
						System.out.println("Mileage: ");
						int mileage = speak.nextInt();
						speak.nextLine();
						
						Automobile vehicle = new Automobile(make, model, color, year, mileage);
						automobile.addVehicle(vehicle);
					} 
					
					else if (menu == 2) {
						System.out.println("");
						System.out.println("Please enter the information of the vehicle you would like to remove.");
						
						System.out.print("Make: ");
						String make = speak.nextLine();
						
						System.out.print("Model: ");
						String model = speak.nextLine();
						
						System.out.print("Color: ");
						String color = speak.nextLine();
						
						System.out.print("Manufacturing Year: ");
						int year = speak.nextInt();
						speak.nextLine();
						
						System.out.print("Mileage: ");
						int mileage = speak.nextInt();
						speak.nextLine();
						
						automobile.removeVehicle(make, model, color, year, mileage);
					}
					
					else if (menu == 3) {
						System.out.println("");
						System.out.println("Please enter the previously stored information of the vehicle you wish to update.");
						System.out.println("Make: ");
						String prevMake = speak.nextLine();
						
						System.out.println("Model: ");
						String prevModel = speak.nextLine();
						
						System.out.println("Color: ");
						String prevColor = speak.nextLine();
						
						System.out.println("Manufacturing Year: ");
						int prevYear = speak.nextInt();
						speak.nextLine();
						
						System.out.println("Mileage: ");
						int prevMileage = speak.nextInt();
						speak.nextLine();
						
						System.out.println("");
						System.out.println("Please enter the new information you would like the vehicle to be changed to.");
						System.out.println("Make: ");
						String newMake = speak.nextLine();
						
						System.out.println("Model: ");
						String newModel = speak.nextLine();
						
						System.out.println("Color: ");
						String newColor = speak.nextLine();
						
						System.out.println("Manufacturing Year: ");
						int newYear = speak.nextInt();
						speak.nextLine();
						
						System.out.println("Mileage: ");
						int newMileage = speak.nextInt();
						speak.nextLine();
						
						automobile.updateVehicle(prevMake, prevModel, prevColor, prevYear, prevMileage, newMake, newModel, newColor, newYear, newMileage);
					}

					else if (menu == 4) {
						automobile.listVehicles();
					}

					else if (menu == 5) {
						try {
							System.out.println("");
							System.out.println("Are you sure you would like to print our inventory to a .txt file?");
							System.out.println("Please enter either 'Y' for Yes or 'N' for No: ");
							String answer = speak.nextLine();
							if (answer.equalsIgnoreCase("Y")) {
								automobile.printVehicles();
							}
							else if (answer.equalsIgnoreCase("N")) {
								System.out.println("Understood. The file will not be printed.");
								System.out.println("");
							}
							else {
								throw new Exception();
							}
						}
						catch (Exception e) {
							System.out.println("");
							System.out.println("Input failed. You may only enter Y or N in this field. Please try again.");
							System.out.println("");
						}
					}
					
					else if (menu == 6) {
						System.out.println("");
						System.out.println("Exiting program now.");
						break;
					}
					
					else {
						System.out.println("");
						System.out.println("You must select a number between 1 to 6. (IE: 2). Please try again.");
						System.out.println("");
					}
				}
				catch (Exception e) {
			        speak.next(); 
					System.out.println("");
			        System.out.println("Input failed. You may only enter integers in this field. Please try again.");
			        System.out.println("");
			    }
			}
			while (true);
		}
		
	}

}
