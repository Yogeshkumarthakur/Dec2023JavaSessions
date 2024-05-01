package dec23javasessions;

public class DataType {

	public static void main(String[] args) {
		// Java:  follows Strict data type concepts
		//data type:
		//1. Primitive data types:
		//no need to create the objects and class
		//2. non primitive data types: String, Classes, Interfaces, Arrays, Object
		
		//primitive data types:
		//Boolean type: true/false
		//Numeric type:
		      //Integral Value: 
		           //1. Integer: byte,short,int,long
		           //2. Floating Point: float,double
		      //Character type: char
		
		//1. byte: 
		//size: 1 byte = 8 bits
		//range: -128 to 127
		
		byte b = 10;
		b = 20;
		b = 30;
		byte b1 = 40;
		byte b2 = -30;
		byte b3 = -128;
		byte b4 = 0;
		byte age = 30;
		System.out.println(b);
		//age, month,week
				
		//2.shot:
		//size: 2 bytes = 16 bits;
		//range: -32768 - 32767
		short s1 = 1000;
		short s2 = 1;
		System.out.println(s1 + s2);
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 - 2147483647
		int i = 10;
		// bill amount, pricing, product price,salary
		
		//4. long: 
		//size: 8 byte = 64 bits
		//range: -2^63 - 2^63-1
		long l = 100000000;
		long l1 = 12111111112L;
		System.out.println(l1);
		//exm: calculation is involved like: distance from earth to moon, 1 planet, world population,medical ranges
		
		//String is a right data type for below data type.
		long phone = 9893064061l;
		long ssn = 121212121l;
		long debit = 32322112123l;
		
		
		//5. float:
		//size: 4 byte = 32 bits
	   //range: can take upto 7 digits
		float f1 = 12.33f;
		System.out.println(f1);
		float f2 = (float) 45.66;
		System.out.println(f2);
		
		float f3 = 100;
		System.out.println(f3);
		
		
		//6. double:
		//size: 8 byte = 64 bits
		//range: can take upto 15 digits
		double d1 = 12.3333; // whenever we need more values after decimal we use double else float can be used
		double buildNumber = 1.1; // not recommended
		
		//pricing, temp, weight, tax
		
		//7. char type:
		//always store in single quote and single digit value only
		
		//range: a-z and A - Z 
		//size: 2 bytes = 16 bits
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		char c = 'a';  //
		char c1 = '1'; //0-9
		char c2 = '$';
		
		char n1 = 'a';
		char n2 = 'b';
		System.out.println(n1);//a
		System.out.println(n2);//b
		System.out.println(n1+n2); //97+98 = 195
		System.out.println(n1-n2); //97+98 = -1
		
		
		//unicode: ASCII Code
		System.out.println('1' + '2');//99
		System.out.println('1');//1
		System.out.println(c);//a
		System.out.println((byte)c);//97
		System.out.println((byte)'$');//36
		System.out.println(100 + 'a');//197
		System.out.println('a'+'b');//195
		System.out.println('a'+""+'b');//ab  it will concatinate by using this ""
		
		//boolean: true/false
		//size: ~1 bit
		//range: no range
		boolean flag = true;
		boolean pop = false;
		boolean isUserActive = true;
		
		int k;
		k=100;
		System.out.println(k);
		
		
		
		
		
		
		
				
		
		
		
		
	}

}
