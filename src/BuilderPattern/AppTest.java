package BuilderPattern;

//caller class
public class AppTest {

	// caller method
	public static void main(String[] args) {

		// obj:
		EcommApplication app = new EcommApplication();

		// method chaining or builder pattern:
		//every class is giving us the current class object so we can create a method chaining kind of work
		//and we can create any sequence with the help of this builder pattern
		
		
		
		app.login("naveen", "naveen123").search("Apple Macbook Pro").addToCart("Apple Macbook Pro")
				.payment("1111 2222 3333 4444", 123).getOrderId().logout();

		System.out.println("********************");

		//
		app.login("naveen", "naveen123").search("tshirt", "black").logout();

		System.out.println("********************");

		//
		app.login("vendor", "V - 123").search("samsung", "silver", 1000).addToCart("samsung").payment("123232424@hdfc")
				.getOrderId().logout();

		System.out.println("********************");

		//
		app.login("vendor", "V - 123").logout();

		System.out.println("********************");

		//
		app.login("vendor", "V - 123");

		System.out.println("********************");

		//
		app.logout();

		System.out.println("********************");

		//
		app.login("yogesh", "yogesh 123", "adminn")
		  .search("Apple")
		    .search("samsung", "black")
		      .search("Dell", "silver", 10000) // overload search method and we can call same method again and again
		         .logout();
		
		

	}

}
