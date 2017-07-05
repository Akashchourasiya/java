import java.util.Scanner;
class PerEmp{
	private String designation;
	private String department;
	private int salary;

	public PerEmp(){
		designation=new String();
		department=new String();
	}
	public int getSalary(){
		return salary;
	}
	public void setSalary(int s){
		salary=s;
	}
	public void acceptData(){
		Scanner a=new Scanner(System.in);
		System.out.println("enter designation");
		designation=a.nextLine();
		System.out.println("enter department");
		department=a.nextLine();
		a.nextLine();
		System.out.println("enter salary");
		salary=a.nextInt();
	}
	public void showData(){
		System.out.println("Designation="+designation);
		System.out.println("Department="+department);
		System.out.println("Salary="+salary);
	}
	public static void main(String args[]){
		PerEmp p=new PerEmp();
		p.acceptData();
		p.showData();
	}
} 
	
	