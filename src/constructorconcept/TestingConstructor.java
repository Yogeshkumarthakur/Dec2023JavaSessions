package constructorconcept;

public class TestingConstructor {

	int age;
	int salary;
	int amount;
	
	public TestingConstructor(int age, int salary, int amount) {
		this.age = age;
		this.salary = salary;
		this.amount = amount;
	}

	public static void main(String[] args) {

		TestingConstructor t1 = new TestingConstructor(10,0,0);
		System.out.println(t1.age + " " + t1.salary + " " + t1.amount);
	}

	//Auxillary Space: overall space taken by the entire class or program inside the RAM.
	//CLass Loader: is a componant in the JDK along with a JRE which will help me load the class inside the class loader.
}
