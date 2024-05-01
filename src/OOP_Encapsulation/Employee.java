package OOP_Encapsulation;

public class Employee {

	// Encapsulation: public layer can access private variables and method. This concept is called encapsulation eg: ATM, Laptop

	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	
	
	//created constructor --  this const is behaving like a setter for me 
	public Employee(String name, int age, double salary, boolean isActive) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
	}
	
	//overloading above constructor
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	
	
	//created public getter and setter:
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}




}
