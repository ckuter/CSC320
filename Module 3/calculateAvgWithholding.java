import java.text.DecimalFormat;
import java.util.Scanner;

public class calculateAvgWithholding {

	public static void main(String[] args) {
		double weeklyIncome;
		double weeklyAvgTax; // the weekly average tax withholding
		double taxRate = 0.10;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		try (Scanner steve = new Scanner(System.in)) {
			System.out.print("Please input your weekly income: ");
			weeklyIncome = steve.nextDouble();
			
		if (weeklyIncome < 500) {
			taxRate = 0.10;
		}
		else if ((weeklyIncome >= 500) && (weeklyIncome < 1500)) {
			taxRate = 0.15;
		}
		else if ((weeklyIncome >= 1500) && (weeklyIncome < 2500)) {
			taxRate = 0.20;
		}
		else if (weeklyIncome >= 2500) {
			taxRate = 0.30;
		}
		
		weeklyAvgTax = Math.floor((weeklyIncome * taxRate)*100)/100.0;
		}
		
		System.out.println();
		System.out.println("Your weekly income is $" + df.format(weeklyIncome) + ".");
		System.out.println("Because your weekly income is $" + df.format(weeklyIncome) + ", your tax rate is " + df.format(taxRate * 100.00) + "%.");
		System.out.println("Your weekly average tax withholding is $" + df.format(weeklyAvgTax) + ".");
	}

}
