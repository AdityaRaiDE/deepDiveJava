package a.b.c;

public class TestStudent {
 public static void main(String args[]) {
        Student aditya = new Student();
        aditya.studentId = 1;
        aditya.studentName = "aditya kumar";
        aditya.inWhichYear = 3;
        System.out.println("Student Name is "+ aditya.studentName +
        		           " With id & Year is " + aditya.studentId +" & "+ aditya.inWhichYear
        		           +" working in comapny " + Student.companyName);
        System.out.println("Updating Student Name");
        aditya.updateName("Aditya Kumar Rai");
        aditya.updateCompanyName("ABCD");
        System.out.println("Updated Student Name & comapny Name");
        System.out.println("---=======---===================--=====");
        System.out.println("Student Name is "+ aditya.studentName +
		           " With id & Year is " + aditya.studentId +" & "+ aditya.inWhichYear
		           +" working in comapny " + Student.companyName);
        System.out.println("---=======---===================--=====");
        aditya.show();
        System.out.println("---=======---===================--=====");
        aditya.updateId(4002);
        System.out.println("---=======---===================--=====");
        System.out.println("Student Name is "+ aditya.studentName +
		           " With id & Year is " + aditya.studentId +" & "+ aditya.inWhichYear
		           +" working in comapny " + Student.companyName);
 }
}
