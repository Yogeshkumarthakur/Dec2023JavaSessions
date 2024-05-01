package dec23javasessions;

public class Customer {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		
		Customer c1 = new Customer();
		c1.name = "Taruna";
		c1.age = 25;
		c1.city = "Pune";
		
		Customer c2 = new Customer();
		c2.name = "Neha";
		c2.age = 35;
		c2.city = "Banglore";
		
		Customer c3 = new Customer();
		c3.name = "Victor";
		c3.age = 30;
		c3.city = "LA";
		
		Customer c4 = new Customer();
		c4.name = "Yogesh";
		c4.age = 38;
		c4.city = "India";
		
		System.out.println(c1.name + " " + c1.age+ " " + c1.city);
		System.out.println(c2.name + " " + c2.age+ " " + c2.city);
		System.out.println(c3.name + " " + c3.age+ " " + c3.city);
		System.out.println(c4.name + " " + c4.age+ " " + c4.city);
		System.out.println("++++++++");
		
		c1=c2;
		//One Object can have multiple referece name/variable
		
		System.out.println(c1.name + " " + c1.age+ " " + c1.city);
		System.out.println(c2.name + " " + c2.age+ " " + c2.city);
		System.out.println(c3.name + " " + c3.age+ " " + c3.city);
		System.out.println(c4.name + " " + c4.age+ " " + c4.city);

		System.out.println("++++++++");
		
		c2=c3;
		
		System.out.println(c1.name + " " + c1.age+ " " + c1.city);
		System.out.println(c2.name + " " + c2.age+ " " + c2.city);
		System.out.println(c3.name + " " + c3.age+ " " + c3.city);
		System.out.println(c4.name + " " + c4.age+ " " + c4.city);

		System.out.println("++++++++");
		
        c3=c4;
		
		System.out.println(c1.name + " " + c1.age+ " " + c1.city);
		System.out.println(c2.name + " " + c2.age+ " " + c2.city);
		System.out.println(c3.name + " " + c3.age+ " " + c3.city);
		System.out.println(c4.name + " " + c4.age+ " " + c4.city);

		System.out.println("++++++++");
		
        c4=c1;
		
		System.out.println(c1.name + " " + c1.age+ " " + c1.city);
		System.out.println(c2.name + " " + c2.age+ " " + c2.city);
		System.out.println(c3.name + " " + c3.age+ " " + c3.city);
		System.out.println(c4.name + " " + c4.age+ " " + c4.city);

		System.out.println("++++++++");
		
		
	}

}
