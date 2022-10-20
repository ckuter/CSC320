import java.util.ArrayList;
import java.util.Scanner;

public class getWeeklyTemps {

	public static void main(String[] args) {
		try (Scanner gimme = new Scanner(System.in)) {
			String userInput; 
			double weeklyAverage = 0.0;
			double sum = 0.0;
			int i;
			boolean dayFound = false;
			
			ArrayList<String> daysOfTheWeek = new ArrayList<String>();
				/* below are the days of the week starting with Monday */
				daysOfTheWeek.add("Monday");
				daysOfTheWeek.add("Tuesday");
				daysOfTheWeek.add("Wednesday");
				daysOfTheWeek.add("Thursday");
				daysOfTheWeek.add("Friday");
				daysOfTheWeek.add("Saturday");
				daysOfTheWeek.add("Sunday");
				
			ArrayList<Double> dailyTemperatures = new ArrayList<Double>();
				/* below are the average temperatures for each day of the week starting with Monday's. 
				   I used Fort Collins, CO's average daily temperatures from the previous week to fill out the list. 
				   All temperatures are in Fahrenheit */
				dailyTemperatures.add(43.75);
				dailyTemperatures.add(46.12);
				dailyTemperatures.add(46.87);
				dailyTemperatures.add(44.12);
				dailyTemperatures.add(35.62);
				dailyTemperatures.add(37.62);
				dailyTemperatures.add(45.00);
			
			for (i = 0; i < dailyTemperatures.size(); ++i) {
				sum = sum + dailyTemperatures.get(i);
			}

			weeklyAverage = Math.floor((sum / dailyTemperatures.size())*100)/100.0;	
				
			System.out.println("What day of the week (Monday - Sunday) would you like the temperature for?");
			System.out.println("If you would like the temperature for every day of the week, enter the word 'week'.");
			System.out.println("If you would like to quit the program, enter the word 'quit'.");
			userInput = gimme.next();

			while (!userInput.equals("quit")) {
			i = 0;
			dayFound = false;
			while (dayFound == false) {
				if (!userInput.equals("week")) {
					if (i < 7) { 
						if (userInput.equals(daysOfTheWeek.get(i))) {
							System.out.println();
							System.out.println("On " + daysOfTheWeek.get(i) + ", the average temperature was " + dailyTemperatures.get(i) + " degrees Fahrenheit.");
							System.out.println();
							dayFound = true;
						}
						else {
							++i;
						}
					}
					else if (i >= 7) {
						dayFound = true;
						System.out.println();
						System.out.println("The day you entered is invalid. Please enter either the word 'week' or one of the following days: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.");
						}
					}
				else if (userInput.equals("week")) {
					dayFound = true;
					System.out.println();
					for (i = 0; i < daysOfTheWeek.size(); ++i) {
						System.out.println("On " + daysOfTheWeek.get(i) + ", the average temperature was " + dailyTemperatures.get(i) + " degrees Fahrenheit.");
					}
					System.out.println();
					System.out.println("The average temperature for the whole week is " + weeklyAverage + " degrees.");
					System.out.println();
				}
			}
					
					System.out.println("What would you like the temperature for next? To quit, enter the word 'quit'.");
					userInput = gimme.next();
			}
			
			if (userInput.equals("quit")) {
			     System.exit(0);
			}
		}
	}
}
