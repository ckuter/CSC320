import java.util.Scanner;

public class gradeStatistics {

	public static void main(String[] args) {
		try (Scanner stella = new Scanner(System.in)) {
			double studentGrade; 
			double gradeAverage = 0;
			double totalGrade = 0; //sum of all grades added together
			double maximumGrade = 0;
			double minimumGrade = 999999; //initialize this variable with a high number that the grades cannot possibly be
			int i;
			
			for (i = 0; i < 10; ++i) {
				System.out.print("Input grade in 0.00 format: ");
				studentGrade = stella.nextDouble();
				totalGrade = totalGrade + studentGrade;
				if (studentGrade > maximumGrade) {
					maximumGrade = studentGrade;
				}
				if (studentGrade < minimumGrade) {
					minimumGrade = studentGrade;
				}
			}
			
			gradeAverage = totalGrade / 10; 
			
			System.out.println();
			System.out.println("Based on the submitted grades, the following information has been calculated:");
			System.out.println("The maximum grade is " + maximumGrade + ".");
			System.out.println("The minimum grade is " + minimumGrade + ".");
			System.out.println("The average of all the grades is " + gradeAverage + ".");
		}

	}

}
