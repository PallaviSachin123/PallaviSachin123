package inheritancePkg;

public class Student extends ClassStd{
	int rollno;
	String stname;
	public void dispStudent()
	{
		dispClassStd();
		System.out.println("Student Roll No. = "+rollno);
		System.out.println("Student Name     = "+stname);
	}
	

}
