import java.util.Scanner;
class Student{
	private String name;
	private int clas;
	private String section;
	private int hindimarks;
	private int sstmarks;
	private int mathsmarks;
	private int sciencemarks;
	public Student(){
		name=new String();
		section=new String();
	}
	public int getClas(){
		return clas;
	}
	public void setClas(int c){
		clas=c;
	}
	public int getHindimarks(){
		return hindimarks;
	}
	public void setHindimarks(int h){
		hindimarks=h;
	}
	public int getSstmarks(){
		return sstmarks;
	}
	public void setSstmarks(int ss){
		sstmarks=ss;
	}
	public int getMathsmarks(){
		return mathsmarks;
	}
	public void setMathsmarks(int m){
		mathsmarks=m;
	}
	public int getSciencemarks(){
		return sciencemarks;
	}
	public void setSciencemarks(int sc){
		sciencemarks=sc;
	}

	public void acceptData(){
		Scanner a=new Scanner(System.in);
		System.out.println("enter name");
		name=a.nextLine();
		a.nextLine();
		System.out.println("enter clas");
		clas=a.nextInt();
		System.out.println("enter section");
		section=a.nextLine();
		a.nextLine();
		System.out.println("enter hindimarks");
		hindimarks=a.nextInt();
		System.out.println("enter sstmarks");
		sstmarks=a.nextInt();
		System.out.println("enter mathsmarks");
		mathsmarks=a.nextInt();
		System.out.println("enter sciencemarks");
		sciencemarks=a.nextInt();
	}
	public void displayData(){
		System.out.println("Name"+name);
		System.out.println("Class"+clas);
		System.out.println("Section"+section);
		System.out.println("Hindimarks"+hindimarks);
		System.out.println("Sstmarks"+sstmarks);
		System.out.println("Mathsmarks"+mathsmarks);
		System.out.println("Sciencemarks"+sciencemarks);
		
	}
	public int getPercentage(){
		return hindimarks+sciencemarks+sstmarks+mathsmarks/4;
	}
	public static void main(String args[]){
		Student st=new Student ();
		st.acceptData();
		st.displayData();
		System.out.println("Percentage is:"+st.getPercentage());
	}
} 