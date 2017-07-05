import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
		int i,n,sum=0;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the no. of terms for fibonacci");
		n=a.nextInt();
		for(i=1;i<=n;i++){
			sum=sum+i;
		System.out.println(" "+sum);
		}
	}
}