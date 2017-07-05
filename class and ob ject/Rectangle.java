import java.util.Scanner;
class Rectangle{
	protected int width;
	protected int height;
	
	public int getWidth(){
		return width;
	}
	public void setWidth(int w){
		width=w;
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int h){
		height=h;
	}
	public void acceptData(){
		Scanner a=new Scanner(System.in);
		System.out.println("enter width");
		width=a.nextInt();
		System.out.println("enter height");
		height=a.nextInt();
	}
	public void displayData(){
		System.out.println("Width"+width);
		System.out.println("Height"+height);
	}
	public int getArea(){
		return width*height;
	}
	public static void main(String args[]){
		Rectangle r=new Rectangle();
		r.acceptData();
		r.displayData();
		System.out.println("Area is:"+r.getArea());
	}
} 
	
	
	