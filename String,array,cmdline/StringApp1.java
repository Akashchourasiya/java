import java.util.Scanner;

class StringApp1 {
	public static void main(String args[]) {
		
		String sentence;
		
		System.out.println("Enter the String : ");
		Scanner in = new Scanner(System.in);
		sentence = in.nextLine();

		if(sentence.length() > 3) {
			System.out.println("Invalid Entry . Maximum character limit exceeded !!!!!!");
			System.exit(0);
		}

		for(int i = 0; i<sentence.length(); i++) {
			char a = sentence.charAt(i);
			if((a>=65 && a<=90 ) || (a>=97 && a<=122))
				continue;
			else {
					System.out.println("Invalid Entry. No special characters or digits allowed. Aborting!!!!!!");
					System.exit(0);
			}
		}

	}
}