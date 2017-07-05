import java.util.Scanner;
class T{
	public static void main(String args[]){
		String str;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		str=in.nextLine();
		
		if(str.length()>=3){
		System.out.println("string is appropriate");
		System.exit(0);
			}
		for(int i=0;i<str.length();i++){
		char a = str.charAt(i);
			if((a>=65 && a<=90 ) || (a>=97 && a<=122))
				continue;
			else{
		System.out.println("string is inappropriate or error");
		System.exit(0);
			}
			}
		}
	}
			
		
		
		
			