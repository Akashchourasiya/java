class StringApp4 {
	public static void main(String args[]) {
		String personName[] = {"rajesh", "Akash", "Anurag", "Ekansh", "Abhit", "Utkarsh", "Stuti", "Shruti", "Kapil", "Manish"};
		for(int i = 0; i < personName.length; i++) {
				boolean b1 = personName[i].toUpperCase().startsWith("A");
				if(b1 == true)
				System.out.println(personName[i]);
		}
	}
} 