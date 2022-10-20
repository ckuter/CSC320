import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class scannerInputMethod {

	public static String stringInput(Scanner sleepy){
		
		System.out.println("You will be asked three questions. Please respond with either 'often', 'occasionally', or 'never'.");
		System.out.println();
		
		System.out.println("How often do you see your friends?");
		String friendFrequency = sleepy.nextLine();
			
		System.out.println("Do your friends swim a lot?");
		String swimFrequency = sleepy.nextLine();
			
		System.out.println("Do your friends ever take you swimming?");
		String friendOutingFrequency = sleepy.nextLine();
			
		Pattern p1 = Pattern.compile("^often$|^occasionally$|^never$", Pattern.CASE_INSENSITIVE);
		Matcher m1a = p1.matcher(friendFrequency);
		Matcher m2a = p1.matcher(swimFrequency);
		Matcher m3a = p1.matcher(friendOutingFrequency);
	
		Pattern p2 = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
		Matcher m1b = p2.matcher(friendFrequency);
		Matcher m2b = p2.matcher(swimFrequency);
		Matcher m3b = p2.matcher(friendOutingFrequency);
		
		try {
			
			if ((!m1a.find() || !m2a.find() || !m3a.find())) {
				throw new Exception(); 	
			}
			
			if ((m1b.find() || m2b.find() || m3b.find())) {
				throw new Exception(); 
			}
			
			System.out.println();
			System.out.println("According to your answers, you said: ");
			System.out.println("You " + friendFrequency + " see your friends.");
			System.out.println("Your friends " + swimFrequency + " go swimming.");
			System.out.println("And your friends " + friendOutingFrequency + " take you swimming.");
			System.out.println();
			return "Success";

		}
		
		catch(Exception e){
			System.out.println();
			return "Failure"; 
		}
	
	}
	
	public static void main(String[] args) {
		Scanner stressed = new Scanner(System.in);
		System.out.println(stringInput(stressed));

	}

}
