package constructorconcept;

public class Employee {

	//class variables
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;

	// contructor:
	// 1.const....will always a part of class template and name will be the same as the class name
	// 2.const... will not have any return type/no void/no return keyword.
	// 3.const... it look like a function but not a function and they cannot be static like method and variables
	// 4.const... overloading is possible
	// 5. default const...depends on use case...N number of objects can be created by the user in this case so try to avoid it
	// ex: launch the browser, u can open n number of browser tab
	// 6. const.. is used for initialing the class variable with the const..local varible by using this keyword

	/*
	 * Cont Vs Function:
	 *  1. const....name will remain same....but in function name can be anything
	 *  2. const...will never have any return...but function may or may not be return
	 *  3. const...will be called when you create the object...but the fun will be called with the Object reference 
	 *  4. const...will help to create the Object of the class, we can restrict un-necessary Object creation
	 *  5. Function...should have the business logic should define the feature of the class..but const should not have any buss logic because we can not return any thing in constructor
	 */

//	public Employee() {// o param or default const...
//		System.out.println("emp - default const.....");
//	}
//
//	public Employee(int i) {// 1 param or default const...
//		System.out.println(i);
//	}
//
//	public Employee(int i, String s) {// 2 param or default const...
//		System.out.println(i + s);
//	}

	

	public Employee(String name, int age) {
	    this("testing", 40, 10);//it should be first statement if u calling other constructor(2nd) under this const
		this.name = name;
		this.age = age;
	}


	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	

	public Employee(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Employee(String name, int age, double salary, boolean isActive, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gender = gender;
		getInfo();// no need to create object if we are calling in NS or static method inside const
		Employee.setInfo();//static method calling
	}
	
	//NS method
	public void getInfo() {
		System.out.println("getting info");
	} // we can call static method inside NS method without creating any object. directly or by using classname

	
	//Static method
	public static void setInfo() {
		System.out.println("setInfo");
	} // we cannot call NS method inside Static method without creating any object
	
	
	public static void main(String[] args) {
		//Employee obj = new Employee(10, "naveen");
		//Employee e1 = new Employee();// we are saving heap memory here
		Employee e1 = new Employee("Tom", 30);// we are saving heap memory here
		
        System.out.println(e1.name);//tom
        System.out.println(e1.age);//30
		System.out.println(e1.salary);//10.0
		
//        
//    	Employee e2 = new Employee("preeti", 35, 'f');
//    	System.out.println(e2.name + " " + e2.age + " " + e2.gender + " " + e2.salary + " " + e2.isActive);
//
//    	Employee e3 = new Employee("shiv", 35, 12.33, true, 'm');
    	
	}
}
