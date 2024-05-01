package BuilderPattern;

public class LoginPage {
	//NS 
	//class variables
	String userName;
	String password;
	 
	//here we creating constructor just to initialize the variable
	public LoginPage(String userName, String password ) {
		this.userName = userName;
		this.password = password;
		
	}
	
	public LoginPage() { //default const
	
	}
	
	//business logic
	//NS is accessing another NS so no need to create the object they can talk directly
	public void doLogin() {
		System.out.println("enter username: " + userName);
		System.out.println("enter password: " + password);
		System.out.println("click on login button");
		System.out.println("user is logged in");
		
	}
	
	
	

}
