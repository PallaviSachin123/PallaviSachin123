package Constructor;
import java.lang.*;
public class Employee {
	String name;
	int id;
	double salary;
	char  gender;
	
	public Employee()//user define constructor or zero parameter constructor
	{
		name = "Pallavi";
		id = 11;
		salary = 50000;
		gender = 'F';
		
	}
	public Employee(String n)
	{
		name = n;
		
	}
	public Employee(String n,  int i)
	{
		name = n;
		id = i;
		
	}
	public Employee(String n, int i, double s, char g )
	{
		name = n;
		id = i;
		salary = s;
		gender = g;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.display();
		Employee e1 = new Employee("Reshma",12,60000,'F');
		e1.display();
		Employee e2 = new Employee("Tejashri");
		e2.display();
		Employee e3 = new Employee("Vivek", 13);
		e3.display();

	}
	
	public void display()
	{
		System.out.println("****************************");
		System.out.println("Employee name = "+name);
		System.out.println("Employee Id is = "+id);
		System.out.println("Employee Salary = "+salary);
		System.out.println("Employee Gender = "+gender);
		System.out.println("****************************\n");
	}

}
