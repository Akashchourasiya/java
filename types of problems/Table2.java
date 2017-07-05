import java.util.Scanner; 
class Table2{
	public static void main(String args[]){
		int i,n,c=1;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a mumber");
		n=a.nextInt();
		for(i=10;i>=1;i--){
			c=i*n;
			System.out.println("table = "+c);		
		}
	}
}