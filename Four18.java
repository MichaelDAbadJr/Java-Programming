import java.util.Scanner;

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