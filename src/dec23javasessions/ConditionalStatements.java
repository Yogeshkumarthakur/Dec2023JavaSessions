package dec23javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {

		// == <= >= !=

		int x = 30;
		int y = 20;
		System.out.println(x > y);

		if (x > y) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		System.out.println("-------");

		if (true) {
			System.out.println("Hi");
		} else {// Dead Code
			System.out.println("Bye");
		}
		System.out.println("-------");

		boolean flag = true;
		if (flag) {
			System.out.println("Hello");
		} else {
			System.out.println("World");
		}
		System.out.println("-------");

		int t1 = 200;
		int t2 = 100;

		if (t1 >= t2) {
			System.out.println("t1 is gr than or equal ");
		}
		System.out.println("-------");

		int p1 = 100;
		int p2 = 100;

		if (p1 != p2) {
			System.out.println("Selenium");
		}

		System.out.println("-------");

//		String browser = "chrome";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome browser");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox browser");
//		}
//		if(browser.equals("Safari")) {
//			System.out.println("launch safari browser");
//		}
//		if(browser.equals("edge")) {
//			System.out.println("launch edge browser");
//		}
//		else {
//			System.out.println("Please pass the right browser");
//		}

		System.out.println("-------");

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome browser");
		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox browser");
		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox browser");
		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox browser");
		} else {
			System.out.println("Please pass the right browser");
		}

	}

}
