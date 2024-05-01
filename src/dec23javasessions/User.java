package dec23javasessions;

public class User {

		//Class: we can say a class is a Category/blueprint/prototype or template
		//Object: we can say instance
		//Human is a class and its properties are name eyes nose, height
		//Laptop is a class then its properties are name,size,colour,price
		
		//Class variable or global variable or Data member same thing
		String name;
		int age;
		String city;
		String telephone;
		double salary;
		boolean isActive;
		
		public static void main(String[] args) {
			
			User u1 = new User();
			u1.name = "Yogesh";
			u1.age = 43;
			u1.city = "Bhopal";
			u1.telephone= "9893064062";
			u1.salary=20.22;
			u1.isActive = true;
			
			System.out.println(u1.name);
			System.out.println(u1.age);
			System.out.println(u1.city);
			System.out.println(u1.salary);
			System.out.println(u1.isActive);
			System.out.println("+++++++++++");

			
			// it will print defaults values because we hanven't declare their values
			User u2 = new User();
			System.out.println(u2.name);//null
			System.out.println(u2.age);//0
			System.out.println(u2.salary);//0.0
			System.out.println(u2.isActive);//false
			System.out.println("+++++++++++");

			
			//
			User u3 = new User();
			u3.name = "Pintoo";
			u3.salary= 65.00;
			u3.isActive = true;
			
			System.out.println(u3.name);
			System.out.println(u3.age);
			System.out.println(u3.city);
			System.out.println(u3.salary);
			System.out.println(u3.isActive);
			System.out.println(u3.telephone);
			System.out.println("+++++++++++");
			
			
			System.out.println(u3);// memory address it will show dec23javasessions.User@4361bd48

			System.out.println("+++++++++++");
			
			//creating below No reference objects. we should never create objects like this
			new User().name = "Tom";
			new User().age = 40;
			
			//null reference Object
			User u4 = new User();
			u4 = null;
		//	u4.name="Yogesh";//null.name = NullPointerException: NPE
			
			
			 u4 = new User();
			 u4.name = "Balli";
			 System.out.println(u4.name);
			
			//To call garbage collector manually 
			System.gc();//but no gurantee JVM will call GC
			
			

	}

}
