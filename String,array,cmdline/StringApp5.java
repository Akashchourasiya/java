class StringApp5 {
	public static void main(String args[]) {
		String personName[] = {"h Abhishek", "hAkash", "hemant", "Ekansh", "Abhit", "Utkarsh", "Stuti", "Shruti", "Kapil", "Manish"};
		for(int i = 0; i < personName.length; i++) {
				boolean b1 = personName[i].toLowerCase().startsWith("h");
				if(b1 == true)
				System.out.println(personName[i]);
		}
	}
} 