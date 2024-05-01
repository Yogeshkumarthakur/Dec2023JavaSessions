package dec23javasessions;

public class Application {

	// duplicate methods are not allowed
	// Method or Function Overloading:
	// 1. when you have different method with the same method name
	// 2. with different number of parameter
	// 3. with the different sequence of parameter
	// 4. return tyoe doesnot matter

	public void test() { // 0 param

	}

	public void test(int i) {// 1 param

	}

	public void test(int i, int j) {// 2 param

	}

	public void test(int i, String k) {// 2 param

	}

	public void test(String k, int i) {// 2 param this is allowed we reverse it

	}

	// ecom app with overloading examples:

	public void login(String un) {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String un, String pwd, String role) {

	}

	// another expample of method overlaoding is on amazon search functionality can
	// be overloaded

	public void search(String name) {

	}

	public void search(String name, String color) {

	}

	public void search(String name, String color, int price) {

	}

	// payment method can also be overloaded

	public void makePayment(String paymentMethod) {
		switch (paymentMethod) {
		case "upi":

			break;

		case "paypal":

			break;

		default:
			break;
		}

	}

	public void makePayment(String cc, String cvv, int otp) {
	}

	// uber app

	public void booking(String st, String end) {

	}

	public void booking(String st, String end, String carType) {

	}

	public void booking(String st, String end, String carType, String paymentType) {

	}

	public static void main(String[] args) {
		Application obj = new Application();
		obj.test(10);
		obj.login("admin", "admin");
		

	}

}
