package dec23javasessions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CallByRefConcept {
	
	String name;
	int age;
	
	public static void getInfo(CallByRefConcept t1) {
		//CallByRefConcept t1 = new CallByRefConcept();
		System.out.println(t1.name);
		System.out.println(t1.age);
		
		t1.name = "Tom";
		t1.age = 35;
		
		System.out.println(t1.name);
		System.out.println(t1.age);


	}
	
	
	public static void main(String []args) {
		CallByRefConcept obj = new CallByRefConcept();
		obj.name = "Prateek";
		obj.age = 30;
		
		getInfo(obj);//call by reference: when calling a method by passing the reference of the class is called call by ref
		
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
//		CallByRefConcept app = new CallByRefConcept();
//		getInfo(app);
		
	}

}
