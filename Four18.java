import java.util.Scanner;
// Count Characters Write a program whose input is a character and a string, 
// and whose output indicates the number of times the character appears in 
// the string. The output should include the input character and use the plural form, 
// n's, if the number of times the character appears is not exactly 1.
public class Four18 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char charIn;
		String stringIn;
		
		charIn = scnr.next().charAt(0);
		stringIn = scnr.nextLine();
		int countChar = 0;
		
		for (int i = 0; i < stringIn.length(); i++) {
			if (stringIn.charAt(i) == charIn) {
				countChar++;
			}
		}
		System.out.println(countChar + " " + charIn + "'s");
	}
}
