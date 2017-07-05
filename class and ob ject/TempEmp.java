import java.util.Scanner;
class TempEmp{
	protected int wage;
	protected int days;
	
	public TempEmp(){
	}
	public TempEmp(int wage,int days){
		this.wage=wage;
		this.days=days;
	}
	public int getWage(){
		return wage;
	}
	public void setWage(int wage){
		this.wage=wage;
	}
	public int getDays(){
		return days;
	}
	public void  setDays(int days){
		this.days=days;
	}
	public void acceptData(){
		Scanner a=new Scanner(System.in);
		System.out.println("enter wage");
		wage=a.nextInt();
		System.out.println("enter days");
		days=a.nextInt();
	}
	public void showData(){
		System.out.println("wage="+wage);
		System.out.println("days="+days);
	}
	public static void main(String args[]){
		TempEmp t=new TempEmp();		
		TempEmp t1=new TempEmp(120,90);
		t.showData();
		t1.showData();
	}
}


