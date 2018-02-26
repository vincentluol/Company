

public class Executive extends Employee {
	
		
	public int setsalary(int s) {
		salary = s;
		return salary;
	}
	
	public void addEmployee(String name){
		Main.Executives.add(name);
	}
	
	public void removeEmployee(String name){
		Main.Executives.remove(name);
	}
	
	public void promoteEmployee(String s){
		System.out.println("Can't be promoted");
	}
	
	public void demoteEmployee(String name){
		Main.Executives.remove(name);
		Main.Managers.add(name);
	}
	   
	public void Employees(){
		for (int i = 0; i < Main.Executives.size(); i++)
			System.out.println(Main.Executives.get(i));
	}
}
