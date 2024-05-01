package dec23javasessions;

public class MathematicalOperators {

	public static void main(String[] args) {

		System.out.println(10/2);//5
		System.out.println(9/2);//4
		System.out.println(9/2.0);//4.5
		System.out.println(9/2.0f);//4.5
		System.out.println(9.0/2);//4.5
		System.out.println(9/2f);//4.5
		System.out.println(9.0/2.0);//4.5
		System.out.println(12.33/4);//3.0825
		
//		System.out.println(9/0);//AE lang.ArithmeticException
//		System.out.println(0/9);//AE lang.ArithmeticException
//		System.out.println(0/0);//AE lang.ArithmeticException
		System.out.println(9.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		System.out.println(0.0/0.0);//NaN  not a number
		System.out.println(0/0.0);//NaN  not a number
		System.out.println(0.0/0);//NaN  not a number
		
		System.out.println(0/12.33);//0.0

		System.out.println('a'/'a');//1
		//System.out.println('a'/0);//97/0 = AE
		System.out.println(0/'a');//0
		
		System.out.println(10 % 2);//0
		System.out.println(9 % 2);//1
		System.out.println(100 % 5);//0
		System.out.println(100 % 3);//1
		System.out.println(17 % 3);//2
		System.out.println(10 % 2);//0
		
		
		System.out.println(9.2 % 2);//1.1999999999999993
		System.out.println(0 % 10);//0
		//System.out.println(10 % 0);//AE
		
		System.out.println(2 % 10);//2
		System.out.println(5 % 10);//5
		System.out.println(7 % 10);//7
		
		System.out.println("Hi I love \"Java\" Training");//Hi I love "Java" Training
		System.out.println("Hi I love 'Java' Training");//Hi I love 'Java' Training
		
		//-128 to 127
		byte b1 = 10;
		byte b2 = 30;
		int b3 = b1+b2;
		System.out.println(b3);//40
		
		short v1 = 1000;
		short v2 = 2000;
		int v3 = v1+v2;
		System.out.println(v3);//3000
		
		byte b4 = (byte)300;// wrong practice code
		System.out.println(b4);//44
		
		
		
		
		
	}

}
