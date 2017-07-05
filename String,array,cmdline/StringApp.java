class StringApp {
	public static void main(String args[]) {

		String sentence = new String("betty got a bit of bitter better butter");
		
		for(int i = sentence.indexOf("b"); i <= sentence.lastIndexOf("b"); i = sentence.indexOf("b",i+1)) {
			System.out.println("Occurences of 'b' at Index : " + "[" + i + "]");
				if(i==sentence.lastIndexOf("b")) {
					break;
			}
		}
		System.out.println("\n");

		for(int i = sentence.indexOf("t"); i <= sentence.lastIndexOf("t"); i = sentence.indexOf("t",i+1)) {
			System.out.println("Occurences of 't' at Index : " + "[" + i + "]");
				if(i==sentence.lastIndexOf("t")) {
					break;
			}
		}
		System.out.println("\n");
		
		String s[] = sentence.split(" ");

		for(int i = 0; i<s.length; i++) {
			System.out.println("Word is \"" + s[i] + "\" whose length is = " + s[i].length());
		}
		
		System.out.println("\n");
		System.out.println("Words starting with b are as follows : ");		
		for(int i = 0; i<s.length; i++) {
			if(s[i].toLowerCase().startsWith("b"))
				System.out.println(s[i]);
		}	
	}
}

