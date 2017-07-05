import java.util.Scanner;
class Employee1 extends TempEmp{
	protected int code;
	protected char name;

	public Employee1(){
		super(120,90);
		code=2;	
		name=a;
	}
	public Employee1(int wage,int days){
		super(wage,days);
		code=2;
		name=a;
	}
	public Employee1(int wage,int days,int code,char name ){
		super(wage,days);
		this.code=code;	
		this.name=name;
	}
	public Employee1(TempEmp t,int code,char name){
		super(t.getwage(),t.getdays());
		this.code=code;	
		this.name=name;
	}
	public Employee1(TempEmp t){
		super(t.getwage(),t.getdays());
		code=2;	
		name=a;
	}
	

	public void acceptData(){
		super.acceptData();
		Scanner a=new Scanner(System.in);
		System.out.println("enter code");
		code=a.nextInt();
		a.nextLine();
		System.out.println("enter name");
		name=a.nextLine().charAt(0);
	}
	public void showData(){
		super.showData();
		System.out.println("code"+code);
		System.out.println("name"+name);
	}
	public int getCode(){
		return  code;
	}
	public int getName(){
		return name;
	}
	public TempEmp getData(){
		int wage=getWage();
		int days=getDays();
		TempEmp t=new TempEmp(wage,days);
		return t;
	}
	public static void main(String args[]){
		Employee1 e1=new Employee1(2,a,120,90);
		TempEmp t=new Point(78,67);
		Employee1 e2=new Employee1(t,20,24);
		e1.showData();
		e2.showData();
	}
} 