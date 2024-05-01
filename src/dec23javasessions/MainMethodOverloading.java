package dec23javasessions;

public class MainMethodOverloading {

	//Yes Main method can be overloeaded
	
	
	//PSVM (String[]) -- JVM will search main signature
	public static void main(String[] args) {

		System.out.println("Hi");
		
		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, "selenium");
		MainMethodOverloading.main("cypress", "selenium");

	}
	
	public static void main(int i) {
		System.out.println("Hello: " + i);
	}
	
	public static void main(int i, String s) {
		System.out.println("naveen: " + i + s );
	}

	public static void main(String i, String s) {
		System.out.println("naveen: " + i + s );
	}

}
