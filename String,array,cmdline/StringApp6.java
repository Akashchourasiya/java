class StringApp6 {
	public static void main(String args[]) {
		String personName[] = {"Abhishek", "Akash", "Hemant", "Ekansh", "Abhit", "Utkarsh", "Stuti", "Shruti", "Kapil", "Manish"};
		for(int i = 0; i < personName.length; i++) {
				if(personName[i].toLowerCase().contains("he"))
				System.out.println(personName[i]);
		}
	}
} 
