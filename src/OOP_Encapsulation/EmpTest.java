package OOP_Encapsulation;

public class EmpTest {

	public static void main (String[] args) {
		
//		Employee e1 = new Employee();
//		
//		e1.setName("gaurav");
//		e1.setAge(20);
//		e1.setSalary(1000);
//		e1.setActive(true);

		//POST -- reg form
		Employee e1 = new Employee("Gaurav", 20, 1000, true);
		
		//GET -- getting the information
		System.out.println(e1.getName()+ " " + e1.getAge()+ " " + e1.getSalary()+ " " + e1.isActive());

		//through set we can update the variable like  below this is the advantage of using Set
		
		//PUT -- update the information
		e1.setAge(30);
		e1.setSalary(3000);
		
		//GET -- getting the information
		System.out.println(e1.getName()+ " " + e1.getAge()+ " " + e1.getSalary()+ " " + e1.isActive());
		
		System.out.println("******************");
		
		
		//creating new user:
		Employee e2 = new Employee("Shiva", 30);
		System.out.println(e2.getName()+ " " + e2.getAge()+ " " + e2.getSalary()+ " " + e2.isActive());
		e2.setSalary(5000);
		e2.setActive(true);
		System.out.println(e2.getName()+ " " + e2.getAge()+ " " + e2.getSalary()+ " " + e2.isActive());

		System.out.println("******************");

		Browser br = new Browser(); //hidden const will be added by the JVM that is why we are
		//able to create the object of the Browser class
		br.launchBrowser();
	
		
	}
	
}
