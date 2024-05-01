package dec23javasessions;

public class Car {

	String name;
	String licenceNumber;
	double price;
	String color;
	static final int wheels = 4;//common value for all these objects and they are called Static property, so we can give common value also
	//static:  means common for all: Static property store in CMA Common Memory allocation(Permanent Generation->Metaspace)
	
	//Non Static : properties always access via object ref name.
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.licenceNumber = "121212";
		c1.price = 80.11;
		c1.color = "Red";
		System.out.println("++++++++++");		
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.licenceNumber = "323232";
		c2.price = 82.11;
		c2.color = "Black";
		System.out.println("++++++++++");	
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.licenceNumber = "22222";
		c3.price = 22.11;
		c3.color = "White";
		
        //How to access static variable? 
		//1. It should be access through class name
		System.out.println(Car.wheels);//4
		System.out.println(c1.name+ " " + c1.licenceNumber+ " " +c1.price+ " " + c1.color + " "+ Car.wheels);// BMW 121212 80.11 Red 4
		System.out.println(c2.name+ " " + c2.licenceNumber+ " " +c2.price+ " " + c2.color + " "+ Car.wheels);//Audi 323232 82.11 Black 4

		//2. static variable can be access directly also
		System.out.println(wheels);//4 but best practise is use by Class name like above
		
		//3. We can also access Static var using Object reference name:
		System.out.println(c1.wheels);//4 but there is a warning: The static field Car.wheels should be accessed in a static way
		System.out.println("++++++++++");	

		


		
	}

}
