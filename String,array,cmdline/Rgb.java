import java.util.Scanner;

	class Rgb{
		public static void main(String args[]){
			String str=new String();
			Scanner a=new Scanner(System.in);
			System.out.println("enter rgb value");
			str=a.nextLine();
			String s[]=str.split(",");
			if(Integer.parseInt(s[0]) > 255 || Integer.parseInt(s[0]) < 0 || Integer.parseInt(s[1]) > 255 || Integer.parseInt(s[1]) < 0 || Integer.parseInt(s[2]) > 255 || Integer.parseInt(s[2]) < 0) {
				System.out.println("Out Of Range ( Varies from 0 to 255).. Try Again. Aborting!!!");
				System.exit(0);
			}
			System.out.println("red is"+s[0]);
			System.out.println("green is"+s[1]);
			System.out.println("blue is"+s[2]);
		}
}