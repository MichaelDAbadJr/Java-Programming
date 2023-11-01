import java.util.Scanner;

public class Four22 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String userText;
		
		userText = scnr.nextLine();
		int letterCount = 0;
		
		for(int i = 0; i < userText.length(); i++) {
			if(Character.isLetter(userText.charAt(i))) {
				letterCount++;
			}
		}
		System.out.println(letterCount);
	}
}
