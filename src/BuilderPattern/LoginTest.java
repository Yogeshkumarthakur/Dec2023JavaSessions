package BuilderPattern;

public class LoginTest {
	
	public static void main(String[] args) {

	
		LoginPage user1 = new LoginPage("Yogesh", "yogesh@123"); //creating object
		user1.doLogin();// calling method
		
		
		
		LoginPage user2 = new LoginPage(); //creating object
		user2.doLogin(); // enter username: null || enter password: null ||	click on login button || user is logged in
		
	}

}
