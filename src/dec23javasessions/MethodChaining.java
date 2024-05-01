package dec23javasessions;

public class MethodChaining {

	
	//static method can also be overloaded. However overriding is not allowed for static method
//	public static void test() {
//		
//	}
//	
//	public static void test(int a) {
//		
//	}
//	
//	public static void test(int a, String b) {
//		
//	}
	
	//3 static methods
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
		//whenever we need to call a non static method from static method we need to the new object
		
		MethodChaining obj1 = new MethodChaining();
		obj1.m1();
		
	}
	
	//3 non static methods
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		t1();//non static method m3 can call static method t1 directly coz they all are in same class
	}
	
	
	public static void main(String[] args) {
		//MethodChaining.t1();
		MethodChaining obj = new MethodChaining();
		obj.m1();
		
		
		//remember these 4 concepts 
		// s - s --> classname.method name or directly
		// NS - NS --> directly
		// S - NS --> need to create a object
		//NS - S --> classname.method name or directly
		
		//m -- s --> classname.method name or directly
		//m -- NS --> need to create a object
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
