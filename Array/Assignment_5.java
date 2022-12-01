class Employee1
{
	int id;
	String name;
	float salary;
	
	Employee1()
	{
		id=01;
		name="Employee1";
		salary=20000;
	}
	
	Employee1(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	void setvalues(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;

	}
	
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



public class Assignment_5 {

	public static void main(String[] args) {
	

		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1(02,"employee2",15000f);
		Employee1 e3 = new Employee1();
		
		
		e1.calculateSalary();
		e1.dispalyEmployeeInfo();
		e2.calculateSalary();
		e2.dispalyEmployeeInfo();
		e3.setvalues(03, "Employee3", 20000f);
		e3.calculateSalary();
		e3.dispalyEmployeeInfo();
		
		
	}

}
