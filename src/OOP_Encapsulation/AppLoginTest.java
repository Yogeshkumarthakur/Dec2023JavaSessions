package OOP_Encapsulation;

public class AppLoginTest {

	public static void main(String[] args) {

		//reg page:
		LoginPage lp = new LoginPage("sameer", "sameer@123");
		lp.doLogin(lp.getUserName());
		
		System.out.println("*******");
		//now I want to change the password
		lp.setPassword("sameer@456");
		lp.doLogin(lp.getUserName());

		
		
		
		
	}

}
