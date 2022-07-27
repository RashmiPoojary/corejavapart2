package java.oops;
class StudentDetails{
	private String studName;
	private int studRollno;
	private String studAdd;
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudRollno() {
		return studRollno;
	}
	public void setStudRollno(int studRollno) {
		this.studRollno = studRollno;
	}
	public String getStudAdd() {
		return studAdd;
	}
	public void setStudAdd(String studAdd) {
		this.studAdd = studAdd;
	}
	
	
}

public class GetSetMethod {
	public static void main(String args[]) {
		StudentDetails details=new StudentDetails();
				details.setStudName("Rashmi Poojary");
				details.setStudRollno(111);
				details.setStudAdd("Bhandup");
				System.out.println("Student name:"+details.getStudName());
				System.out.println("Student Rollno:"+details.getStudRollno());
				System.out.println("Student name:"+details.getStudAdd());
				
	}
	

}
