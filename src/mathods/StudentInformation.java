package mathods;

public class StudentInformation {

	public static void main(String[] args) {
		StudentInformation st = new StudentInformation();
		st.acceptData();
		//st.acceptData();
		st.acceptData("Tejashri Chaudhari", 10, 'F', 99.99f);
		st.acceptData("Reshma Chaudhari", 20, 'F', 99.90f);
	}
	public void acceptData() {
		//name, rollNo , gender , percentage
		String name = "Pallavi Dere";
		int rollNo = 18;
		char gender = 'F';
		float percentage = 98.72f;
		
		System.out.println("Name of student         : "+name);
		System.out.println("Student's gender        : "+gender);
		System.out.println("Student's RollNo        : "+rollNo);
		System.out.println("Student's Average Result: "+percentage);
		System.out.println();
		
		
	}
	public void acceptData(String name,int rollNo, char gender,float percentage ) {
		//name, rollNo , gender , percentage
		System.out.println("Name of student         : "+name);
		System.out.println("Student's gender        : "+gender);
		System.out.println("Student's RollNo        : "+rollNo);
		System.out.println("Student's Average Result: "+percentage);
		System.out.println();

}
}
