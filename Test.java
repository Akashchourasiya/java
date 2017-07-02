import java.util.Scanner;
class Test{
	public static void main(String args[]){
		String name,add;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a name");
		name=a.nextLine();
		System.out.println("enter address");
		add=a.nextLine();
		System.out.println("name is"+name+"\n address is"+add);
	}
}