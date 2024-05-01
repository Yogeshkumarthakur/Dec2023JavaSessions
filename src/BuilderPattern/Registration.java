package BuilderPattern;

public class Registration {

	// class var
	String name;
	String tel;
	String pwd;

	public void userReg(String name, String tel, String pwd) {// local var
		System.out.println("enter un:" + name);
		System.out.println("enter tel:" + tel);
		System.out.println("enter pwd:" + pwd);

		//Use of this keyword: Famouns interview question
		//1. const + this
		//2. const calling: one const is calling another const in the same class
		//3. method + this this keyword can be used to initialize the class var with the local var like in this Registration class
		//4. builder pattern: every class method is giving me return this keyword 
		this.name = name;
		this.pwd = pwd;
		this.tel = tel;
	}

	public void getUserInfo() {
		System.out.println(name + " " + tel + " " + pwd);// due to use of this keyword we get the class var value here
	}

	public static void main(String[] args) {
		Registration reg = new Registration();
		reg.userReg("sana", "123456789", "sana@123");

	}

}
