class Employee{
	String name;
	int salary;
}



public class Manager extends Employee{

	String depart;
	
	public String getManager() {
	
		return name+" " +salary+ "" + depart;
		
	}
	

}

	

