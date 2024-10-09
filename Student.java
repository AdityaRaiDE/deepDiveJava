package a.b.c;

public class Student {
	//class level variable 
	static String companyName = "xxxxxx" ;
	
	int studentId;
	String studentName;
	int inWhichYear;
	
	int x = 20;
	int y = 30;
	int z = x + y;
	//z = x+ y +10;
	static int m = 45;
	static int n = 30;
	static int k = m + n ;
	void show() {
		
		System.out.println(this.z);
		System.out.println(Student.k);
	}
	boolean updateName(String studentName) {
		this.studentName = studentName;
		return true;
	}
	boolean updateId(int studentId) {
		studentId = studentId;
		System.out.println(studentId);
		return true;
	}
	
	boolean updateCompanyName(String companyName) {
		Student.companyName = companyName;
		return true;
	}
}
