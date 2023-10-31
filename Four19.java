import java.util.Scanner;

public class Four19 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String userString;
		int letterCount = 0;
		int digitCount = 0;
		int splCount = 0;
		
		userString = scnr.next();
		
		// Ignore the comments, it was used for debugging purposes
		for(int i = 0; i < userString.length(); i++) { 
			if(Character.isLetter(userString.charAt(i))) {
				letterCount++;
				// System.out.println(userString.charAt(i) + ": Letter");
				// System.out.println(letterCount);
			} else if(Character.isDigit(userString.charAt(i))){
				digitCount++;
				// System.out.println(userString.charAt(i) + ": Digit");
				// System.out.println(digitCount);
			} else {
				splCount++;
				// System.out.println(userString.charAt(i) + ": Special Character");
				// System.out.println(splCount);
			}
		}
		// System.out.println("Letter Count Is: " + letterCount);
		// System.out.println("Digit Count Is: " + digitCount);
		// System.out.println("Special Character Count Is: " + splCount);
		if(letterCount > 0 || splCount > 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
