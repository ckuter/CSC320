import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Automobile {
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	private ArrayList<Automobile> vehicleList;
	
	//default constructor???
	public Automobile() {
		vehicleList = new ArrayList<Automobile>();
		this.make = null;
		this.model = null;
		this.color = null;
		this.year = 0;
		this.mileage = 0;
	}
	
	//parameterized constructor???????
	public Automobile(String make, String model, String color, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
	}

	//the following are the set methods used to set the value of the variables
	public void setMake (String make){
		this.make = make;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setYear (int year){
		this.year = year;
	}
	public void setMileage(int mileage){
		this.mileage = mileage;
	}

	//the following are the get methods used to return the values of the variables
	public String getMake(){
		return this.make;
	}
	public String getModel(){
		return this.model;
	}
	public String getColor(){
		return this.color;
	}
	public int getYear(){
		return this.year;
	}
	public int getMileage(){
		return this.mileage;
	}
	
	
	//file stream initialization for printing the data to a .txt file
	FileOutputStream fileStream = null;
    PrintWriter writer = null;
	
	//the following is the method to add a vehicle
	public void addVehicle(Automobile vehicle) {
		vehicleList.add(vehicle);
		System.out.println("");
		System.out.println("The vehicle has successfully been added to the inventory.");
		System.out.println("We will now print our updated inventory below.");
		listVehicles();
	}
	
	//the following is the method to remove a vehicle
	public void removeVehicle(String make, String model, String color, int year, int mileage) {
		try {
			for (int i = 0; i <= vehicleList.size(); i++) {
				if (i < vehicleList.size()) {
					Automobile vehicle = vehicleList.get(i);
					if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model) && vehicle.getColor().equalsIgnoreCase(color) && vehicle.getYear() == year && vehicle.getMileage() == mileage) {
						vehicleList.remove(vehicle);
						System.out.println("");
						System.out.println("The vehicle has successfully been removed.");
						System.out.println("");
						break;
					} 
				}
				else {
					throw new Exception();
				}	
			}
		}
		catch (Exception e) {
			System.out.println("");
			System.out.println("Vehicle removal failed. There is no vehicle matching the information of the one you want to remove. Please try again.");
			System.out.println("");
		}
	}
	
	//the following is the method to update a vehicle
	//prev = previous
	public void updateVehicle(String prevMake, String prevModel, String prevColor, int prevYear, int prevMileage, String newMake, String newModel, String newColor, int newYear, int newMileage) {
		try {
			for (int i = 0; i <= vehicleList.size(); i++) {
				if (i < vehicleList.size()) {
					Automobile vehicle = vehicleList.get(i);
					if (vehicle.getMake().equalsIgnoreCase(prevMake) && vehicle.getModel().equalsIgnoreCase(prevModel) && vehicle.getColor().equalsIgnoreCase(prevColor) && vehicle.getYear() == prevYear && vehicle.getMileage() == prevMileage) {
						vehicle.setMake(newMake);
						vehicle.setModel(newModel);
						vehicle.setColor(newColor);
						vehicle.setYear(newYear);
						vehicle.setMileage(newMileage);
						System.out.println("");
						System.out.println("The vehicle's information has successfully been updated.");
						System.out.println("We will now print our updated inventory below.");
						listVehicles();
						break;
					}
				}
				else {
					throw new Exception(); 
				}
			}
		}
		catch (Exception e) {
			System.out.println("");
			System.out.println("Vehicle update failed. There is no vehicle matching the information of the one you want to update. Please try again.");
			System.out.println("");
		}
	}
	
	//the following is the method to list all current vehicles
	public void listVehicles() {
		boolean arrayCheck = vehicleList.isEmpty();
		System.out.println("");
		System.out.println("Here are all our current vehicles: ");
		if (arrayCheck == true) {
			System.out.println("There are no vehicles currently stored in the inventory.");
		}
		else {
		System.out.println("");
		for (int i = 0; i < vehicleList.size(); i++) {
				Automobile vehicle = vehicleList.get(i);
				System.out.println("Vehicle " + (i + 1) + ": ");
				System.out.println("Make: " + vehicle.getMake());
				System.out.println("Model: " + vehicle.getModel());
				System.out.println("Color: " + vehicle.getColor());
				System.out.println("Year: " + vehicle.getYear());
				System.out.println("Mileage: " + vehicle.getMileage());
				System.out.println("");
			}
		}
		
	}
	
	//the following is the method to print the current inventory to a .txt file
	public void printVehicles() {
		try{
			File inventoryFile = new File("./inventoryList.txt");
			fileStream = new FileOutputStream(inventoryFile);
			writer = new PrintWriter(fileStream);
			boolean arrayCheck = vehicleList.isEmpty();
			
			System.out.println("");
			System.out.println("Printing all inventory data to the file now.");
			if (arrayCheck == true) {
				writer.println("There are no vehicles currently stored in the inventory.");
			}
			else{
				for (int i = 0; i < vehicleList.size(); i++) {
					Automobile vehicle = vehicleList.get(i);
					writer.println("Vehicle " + (i + 1) + ": ");
					writer.println("Make: " + vehicle.getMake());
					writer.println("Model: " + vehicle.getModel());
					writer.println("Color: " + vehicle.getColor());
					writer.println("Year: " + vehicle.getYear());
					writer.println("Mileage: " + vehicle.getMileage());
					writer.println("");
				}
			}
	        System.out.println("All data has successfully been printed.");
		} 
		catch (IndexOutOfBoundsException e) {
			System.out.println("");
			System.err.println("Error: Printing data failed. Caught IndexOutOfBoundsException: " + e.getMessage());
			System.out.println("");
		} 
		catch (IOException e){
			System.out.println("");
			System.err.println("Error: Printing data failed. Caught IOException: " + e.getMessage());
			System.out.println("");
		} 
		finally {
			if (writer != null) {
				System.out.println("Closing file.");
				System.out.println("");
				writer.close();
			}
		}
		
		
	}


}
