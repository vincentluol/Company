import java.util.*;


public class Main {

	public static ArrayList<String>Executives = new ArrayList<String>();
	public static ArrayList<String>Managers = new ArrayList<String>();
	public static ArrayList<String>SalariedWorkers = new ArrayList<String>();
	public static ArrayList<String>HourlyWorkers = new ArrayList<String>();



	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		Executive e = new Executive();
		Manager m = new Manager();
		SalariedWorker s = new SalariedWorker();
		HourlyWorker h = new HourlyWorker();
		e.hire("Bob", "Hightstown", 30);
		m.hire("John", "Newark", 20);
		s.hire("James", "New York", 25);
		h.hire("Sally", "Brunswick", 24);
		m.promote("John");
		e.getEmployees();
		h.promote("Sally");
		e.demote("Bob");
		getAllEmployees();

		int action = scanner(console);
		if (action == 1){
			System.out.println("Name: ");
			String name = getName(console);
			System.out.println("Address: ");
			String address = getAddress(console);
			System.out.println("Age: ");
			int age = getAge(console);     
			int employeeType = getType(console);
			if (employeeType == 1)
				e.hire(name, address, age);
			else if (employeeType == 2)
				m.hire(name, address, age);
			else if (employeeType == 3)
				s.hire(name, address, age);
			else if (employeeType == 4)
				h.hire(name, address, age);
			else
				System.out.println("invalid");

		}
		getAllEmployees();
	}

	public static int getType(Scanner console){
		System.out.println("Choose one option from following : ");
		System.out.println("1) Executive");
		System.out.println("2) Manager");
		System.out.println("3) Salaried Worker");
		System.out.println("4) Hourly Worker");
		int employeeType = console.nextInt();
		System.out.println();
		return employeeType;
	}

	public static String getName(Scanner console){
		String name = console.nextLine();
		System.out.println();
		return name;
	}

	public static String getAddress(Scanner console){
		String address = console.nextLine();
		System.out.println();
		return address;
	}

	public static int getAge(Scanner console){
		int age = console.nextInt();
		System.out.println();
		return age;
	}

	public static void hire(Scanner console){

	}

	public static int scanner(Scanner console){
		System.out.println("Choose one option from following : ");
		System.out.println("1) Add a new employee.");
		System.out.println("2) Fire an employee.");
		System.out.println("3) Promote an employee.");
		System.out.println("4) Demote an employee.");
		System.out.println("5) List all employees.");
		System.out.println("6) Exit.");
		int action = console.nextInt();
		System.out.println();
		return action;

	}

	public static void getAllEmployees(){
		System.out.println("Executives: " + Executives);
		System.out.println("Managers: " + Managers);
		System.out.println("SalariedWorkers: " + SalariedWorkers);
		System.out.println("HourlyWorkers: " + HourlyWorkers);
	}


}