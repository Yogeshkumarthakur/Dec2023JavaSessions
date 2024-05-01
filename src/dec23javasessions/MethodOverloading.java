package dec23javasessions;

public class MethodOverloading {

	//Method overloading
	//Poly(many) + morphism(forms): it is also called compile time Polymorphism (static binding)
	
	public void search(int a) { //here a is called parameter of the method
		System.out.println(a);
	}
	
	public void search(int a,String color) {
		System.out.println();
	}
	
	public void search(int a,String color, String name) {
		System.out.println();
	}	
	
	
	
	
	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.search(10);// calling a method by passing the value /argument is called call by value


		
		
		
	}

}
