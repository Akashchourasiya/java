import java.util.Scanner;
class Circle{
	private float radius;
	
	public float getRadius(){
		return radius;
	}
	public void setRadius(float r){
		radius=r;
	}
	public void acceptData(){
		Scanner a=new Scanner(System.in);
		System.out.println("enter radius");
		radius=a.nextFloat();
			}
	public void displayData(){
		System.out.println("Radius="+radius);
		}
	public float getArea(){
		return (float)(3.14*radius*radius);
		}
	public float getCircumference(){
		return (float)(2*3.14*radius);
		}
	public static void main(String args[]){
		Circle c=new Circle();
		c.acceptData();
		c.displayData();
		System.out.println("Area is"+c.getArea());
		System.out.println("circumference is"+c.getCircumference());
		}
	}