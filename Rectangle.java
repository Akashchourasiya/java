import java.util.Scanner;
class Rectangle{
	public static void main(String args[]){
		 int length,breadth,area=0,perimeter=0;	
		Scanner a=new Scanner(System.in);
		System.out.println("enter a length");
		length=a.nextInt();
		System.out.println("enter a breadth");
		breadth=a.nextInt();
		area=length*breadth;
		perimeter=2*(length+breadth);
		System.out.println("area="+area+"\nperimeter="+perimeter);
	}
}