import java.util.Scanner; 
class Checkbound{
	public static void main(String args[]){
		char ch;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a charecter");
		ch=a.nextLine().charAt(0);
		if(ch>=65&&ch<=90)
		System.out.println("charecter is upper bound" );
		else if(ch>=97&&ch<=122)
		System.out.println("charecter is lower bound");
		else	
		System.out.println("it is something else");
		}
	}
