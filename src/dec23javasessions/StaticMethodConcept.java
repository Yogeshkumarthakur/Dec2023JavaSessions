package dec23javasessions;

public class StaticMethodConcept {

	// class static variable
	public static String name;

	// non static variable
	public int age;

	// static class
	public static void getInfo() {
		System.out.println("get info");
	}

	// non static class
	public void sendMail() {
		System.out.println("send mail");
	}

	public static void main(String[] args) {

		//call static method or variable: always by class name or directly
		//1. by using class name:
		StaticMethodConcept.name = "Tom";
		System.out.println(StaticMethodConcept.name);
		StaticMethodConcept.getInfo();
		
		//2. non static method: need to create the object
		StaticMethodConcept obj = new StaticMethodConcept();
		obj.age = 10;
		obj.sendMail();
		System.out.println(obj.name);//warning will come: Not recommended   static variable should be call in a static way
		obj.getClass();//warning will come: Not recommended static method should be call in a static way
		
		//3. we can call static method or variable: diretly as well without any classname:
		System.out.println(name);
		getInfo();
		
		
	}

}
