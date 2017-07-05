import java.util.Scanner; 
class Display{
	public static void main(String args[]){
		int i;
		Scanner a=new Scanner(System.in);
		System.out.println("enter number");
		i=a.nextInt();
		if(i>0 && i<=9){
		System.out.println("number is single digit"+i);
			}		
		else if(i>9 && i<=99){
		System.out.println("number is double digit"+i);
			}
		else if(i>99 && i<=999){
		System.out.println("number is triple"+i);
			}
		else{	
		System.out.println("number is more than one digit");
			}
		}
}
