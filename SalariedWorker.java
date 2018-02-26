
public class SalariedWorker extends Employee {
	
	public int setsalary(int s) {
		salary = s;
		return salary;
	}
	
	public void addEmployee(String name){
		Main.SalariedWorkers.add(name);
	}
	
	public void removeEmployee(String name){
		Main.SalariedWorkers.remove(name);
	}
	
	public void promoteEmployee(String name){
		removeEmployee(name);
		Main.Managers.add(name);
	}
	
	public void demoteEmployee(String name){
		removeEmployee(name);
		Main.HourlyWorkers.add(name);
	}
	
	public void Employees(){
		for (int i = 0; i < Main.SalariedWorkers.size(); i++)
			System.out.println(Main.SalariedWorkers.get(i));
	}
}
