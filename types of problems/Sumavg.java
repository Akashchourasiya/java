class Sumavg{
	public static void main(String args[]){
		int i,sum=0;
		float avg;
		for(i=500;i<=600;i++){
			if(i%5==0){
			sum=sum+i;
				}
				}
			avg=sum/12;
			System.out.println(" "+sum);
			System.out.println(" "+avg);
			
		}
}
//import java.util.Scanner;
class T{
	public static void main(String args[]){
		int i,count=0,sum=0 ;
		float avg;
		Scanner a=new Scanner(System.in);
		for(i=500;i<=600;i+=5){
		sum+=i;
		count++;
		}
		avg=(float)sum/count;
		System.out.println("sum is"+sum);
		System.out.println("average is"+avg);
		}
}		