
public abstract class Employee {

	String name;
	String address;
	int age;
	int salary;

	public void hire(String name, String address, int age){
		this.name = name;
		this.address = address;
		this.age = age;
		addEmployee(name);
	}
	
	public void fire(String name){
		removeEmployee(name);
	}
	
	public void promote(String name){
		promoteEmployee(name);
	}
	
	public void demote(String name){
		demoteEmployee(name);
	}
	
	public void getEmployees(){
		Employees();
	}
	

	public abstract int setsalary(int s);
	public abstract void addEmployee(String s);
	public abstract void removeEmployee(String s);
	public abstract void promoteEmployee(String s);
	public abstract void demoteEmployee(String s);
	public abstract void Employees();
	
}
