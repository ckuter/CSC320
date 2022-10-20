import java.util.Scanner;

public class personalInfo {

	public static void main(String[] args) {
		String firstName;
		String lastName; 
		String streetAddress;
		String city;
		String zipCode;
		
		try (Scanner scnr = new Scanner(System.in)) {
			System.out.print("Enter the first name: ");
			firstName = scnr.nextLine();
			
			System.out.print("Enter the last name: ");
			lastName = scnr.nextLine();
			
			System.out.print("Enter their street address: ");
			streetAddress = scnr.nextLine();
			
			System.out.print("Enter their city: ");
			city = scnr.nextLine();
			
			System.out.print("Enter their zip code: ");
			zipCode = scnr.nextLine();
		}
		
		System.out.println();
		System.out.println("The individual's information is as follows:");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(streetAddress);
		System.out.println(city);
		System.out.println(zipCode);
		
	}

}
