package dec23javasessions;

import java.util.ArrayList;

public class FunctionTest {

	// main method signature PSVM(String a[])

	// WAF: function Name: getStudentMarks
	// input parameter:studentName (String)
	// return: marks (int)
	// student not found --> return something

	public int getstudentMarks(String studentName) {
		System.out.println("getting marks for student: " + studentName);
		int marks = -1;

		if (studentName.trim().equalsIgnoreCase("devika")) {
			// return 90;
			marks = 90;
		} else if (studentName.equalsIgnoreCase("ravi")) {
			// return 95;
			marks = 95;
		}
		if (studentName.equalsIgnoreCase("naveen")) {
			// return 10;
			marks = 10;

		} else {
			System.out.println("student name not found...Plz pass the right student name " + studentName);
			// return -1;

		}
		return marks;
	}

	// same above case with the Switch case statement

	public int getMarks(String studentName) {
		System.out.println("getting marks for student: " + studentName);

		switch (studentName.toLowerCase().trim()) {
		case "devika":
			return 95;
		case "ravi":
			return 90;
		case "naveen":
			return 10;

		default:
			System.out.println("student name not found...Plz pass the right student name " + studentName);
			return -1;
		}
	}

	// new example using switch case

	public boolean launchBrowser(String browserName) {
		System.out.println("browserName " + browserName);

		switch (browserName) {
		case "chrome":
			System.out.println("chrome is launched");
			return true;
		case "firefox":
			System.out.println("firefox is launched");
			return true;
		case "edge":
			System.out.println("edge is launched");
			return true;

		default:
			System.out.println("please pass the right browser...." + browserName);
			return false;
		}

	}
	
	//WAF: 
	//function name: getDevicesList
	//input param: empName
	//return: ArrayList<String> devicesList
	
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("getting devices list for emp: " + empName);
		ArrayList<String> devicesList = new ArrayList<String>();
		
		switch (empName.toLowerCase().trim()) {
		case "pallavi":
			devicesList.add("Macbook Pro");
			devicesList.add("Macbook Air");
			devicesList.add("iphone");
			break;
		case "sudhir":
			devicesList.add("Windows Lenovo");
			devicesList.add("Samsung s10");
			break;
		case "saida":
			devicesList.add("Airtel sim");
			break;

		default:
			System.out.println("please pass the right empName.......emp name not found: " + empName);
			break;
		}
		return devicesList;
			
		
	}
	
		

	// main method is always void because it never return anything
	public static void main(String[] args) {

		FunctionTest obj = new FunctionTest();
		// int m1 = obj.getstudentMarks("devika");
		// System.out.println(m1);

		System.out.println("-------------");
		
		int m1 = obj.getMarks("naveen");
		System.out.println(m1);

		if (m1 == -1) {
			System.out.println("no need to print the marksheet");
		} else {
			System.out.println("Print the marksheet");
		}
		
		System.out.println("-------------");
		
		boolean isLaunched = obj.launchBrowser("ie");
			System.out.println(isLaunched);
			if(isLaunched) {
				System.out.println("enter the URL");
			}
			System.out.println("-------------");

			
			ArrayList<String> actDevList = obj.getDevicesList("pallavi");
			System.out.println(actDevList);
			System.out.println(actDevList.size());

		}
	}
	


