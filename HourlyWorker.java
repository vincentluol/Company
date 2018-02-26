
public class HourlyWorker extends Employee {
	
	public int setsalary(int s) {
		salary = s;
		return salary;
	}
	
	public void addEmployee(String name){
		Main.HourlyWorkers.add(name);
	}
	
	public void removeEmployee(String name){
		Main.HourlyWorkers.remove(name);
	}
	
	public void promoteEmployee(String name){
		removeEmployee(name);
		Main.SalariedWorkers.add(name);
	}
	
	public void demoteEmployee(String name){
		System.out.println("Cannot be demoted");
	}
	
	public void Employees(){
		for (int i = 0; i < Main.HourlyWorkers.size(); i++)
			System.out.println(Main.HourlyWorkers.get(i));
	}
}
