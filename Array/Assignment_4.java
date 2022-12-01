class Employee
{
	int id;
	String name;
	float salary;
	
	void calculateSalary()
	{
		float HRA,DA,PF;
		
		HRA=salary*(10f/100.0f);
		DA=salary*(5f/100.0f);
		PF=salary*(7f/100.0f);
		
		salary=salary+HRA+DA-PF;
		
		//hra, da, and pf 
		
	}
	
	void dispalyEmployeeInfo()
	{
		System.out.println("id is:"+id);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}
	
}

public class Assignment_4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Employee e1= new Employee();	
		e1.id=01;
		e1.name="Employee2";
		e1.salary=10000;
		
		e1.dispalyEmployeeInfo();
		
		
		Employee e2= new Employee();	
		e2.id=02;
		e2.name="Employee2";
		e2.salary=10000;
		e2.calculateSalary();
		e2.dispalyEmployeeInfo();
		
		
	}

}
