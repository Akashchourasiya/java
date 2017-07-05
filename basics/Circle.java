import java.util.Scanner;
class Circle{
	public static void main(String args[]){
		 float radius,area=0,circ=0;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a radius");
		radius=a.nextFloat();
		area=3.14f*radius*radius;
		circ=3.14f*2*radius;
		System.out.println("area="+area+"\ncircumfernce="+circ);
	}
}
	
	