package dec23javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {

	// Cannot create function/method inside a function
	// cannot are parallel to each other
	// but can call a function from another function
	// Non Static functions are also called the data member of the class just like
	// var we talk before
	// void and

	// 1. Function: no input no return
	// input: no input - 0 parameter
	// return: void: cannot be return anything
	// void and return cannot be together

	public void test() {
		System.out.println("test method");
	}

	// 2. Function: some input and no return
	// input: some input - 1 parameter
	// return: void
	public void getBill(int days) {// 1 para
		System.out.println("getting bill info");
		int finalAmount = days * 100;
		System.out.println(finalAmount);// 1000

	}

	// 3. Function: some input and some return
	// input: - 2 parameter
	// return: int

	public int sum(int a, int b) {// 2 para function
		System.out.println("adding two num");
		int c = a + b;
		return c;
	}

	// 4. Function: no input and some return
	public String getInfo() {
		System.out.println("getting information");
		String s = "Hello App";
		return s;
	}

	// 5. using boolean function
	// return type: boolean
	public boolean isAppExist() {
		return true;
	}

	//
	public int calculateMarks(int marks, int extraMarks, int disMarks) {
		int finalMarks = marks + extraMarks;
		return finalMarks;

	}

	// blank return
	public void printName() {
		System.out.println("Yogesh");
		return;// this is knowns as blank return or void
	}

	// it is not necessary that a fun should return everytime
	public void launchURL(String url) {
		System.out.println(url);
	}

	// a fun cannot have multiple return at same time.\
	// return should be the last statement of the func
	public int testing() {
		System.out.println("testing is done");
		return 100;
		// return true;
	}
	
	// we can return array as well in the function:
	public String [] getDevices() {
		System.out.println("getting devices");
		String devices [] = {"Macbook", "ipad", "iphone"};
		return devices;	
	}
	
	// we can return arrayList as well in the function:
	public ArrayList<String> getUserLists() {
		System.out.println("getting all users");
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("Ravi");
		userList.add("Balli");
		userList.add("Yogesh");

		return userList;
		
		
	}


	public static void main(String[] args) {

		// call a function: create a object for non static function
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.getBill(10);// calling function by passing the value/argument. it is called "call by value"
		// we can call any func n no of times
		obj.getBill(20);
		// System.out.println(obj.sum(10, 20)); //not a good practise to call function
		// direct in syso
		int m = obj.sum(10, 20);
		System.out.println(m);

		String msg = obj.getInfo();
		System.out.println(msg);

		if (obj.isAppExist()) {
			System.out.println("Login to app");
		}

		int f1 = obj.calculateMarks(70, 10, 5);
		System.out.println(f1);

		obj.launchURL("https://www.google.com");
		
		String myDevices []=  obj.getDevices();
		System.out.println(Arrays.toString(myDevices));
		System.out.println(myDevices.length);
		
		ArrayList<String> myList = obj.getUserLists();
		System.out.println(myList); //no need to use Arraylist.toString becoz Arraylist can be print directly in console
		System.out.println(myList.size());
		//if u wanna again add something in a fun
		myList.add("Sapna");
		System.out.println(myList);
		System.out.println(myList.size());
		
	
	
	}

}
