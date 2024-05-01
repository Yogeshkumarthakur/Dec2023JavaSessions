package dec23javasessions;

public class FinalKeyword {

	 final int num = 20;//class var
	
	public static void main(String[] args) {

		
		//1. we cannot make local var static
		//2. we can use Final keyboword on class as well as in local var
		final int i = 10; //local var
		
		System.out.println(i);//10
		//System.out.println(FinalKeyword.i);//static var can be use in a static way by using class name if var name is same like we use i here - 20
		//System.out.println(num);
		
		//
		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.num);
		
		//constant var: always use capital letter.  Another ex seat in a movie theatre should be used with final keyword
		final int DAYS_IN_WEEK = 7;
		//DAYS_IN_WEEK = 10;
		int salary = 100*DAYS_IN_WEEK;
		System.out.println(salary);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
