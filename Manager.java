import java.util.ArrayList;


public class Manager extends Employee{


	
	public int setsalary(int s) {
		salary = s;
		return salary;
	}
	
	public void addEmployee(String name){
		Main.Managers.add(name);
	}
	
	public void removeEmployee(String name){
		Main.Managers.remove(name);
	}
	
	public void promoteEmployee(String name){
		removeEmployee(name);
		Main.Executives.add(name);
	}
	
	public void demoteEmployee(String name){
		removeEmployee(name);
		Main.Executives.add(name);
	}
	
	public void Employees(){
		for (int i = 0; i < Main.Managers.size(); i++)
			System.out.println(Main.Managers.get(i));
	}
}
