import java.util.Scanner; 
class Vowel{
	public static void main(String args[]){
		char ch;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a charecter");
		ch=a.nextLine().charAt(0);
		if(ch=='a')
		System.out.println("charecter is vowel" );
		else if(ch=='e')
		System.out.println("charecter is vowel");
		else if(ch=='i')
		System.out.println("charecter is vowel");
		else if(ch=='o')
		System.out.println("charecter is vowel");
		else if(ch=='u')
		System.out.println("charecter is vowel");
		else
		System.out.println("it is consonent");
	}
}