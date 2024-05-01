package dec23javasessions;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArraysConcept {

	public static void main(String[] args) {
		// Arrays: is a non-premitive datatypes
		//It is a collection which can store similar type of data types
		
		//Limitation of Arrya:
		//1. size is fixed. thats why it is also called Static array
		//2. It can store only similar type of data, this can be resolve by object array but here also size size is fixed. this can be resolve by dynamic array.
		
		//Where Static array wont work and Dynamic array should used
		//1. Uber booking at 5 pm in banglor
		//2. USer registration on ecomm site.
		//3. emp drop down in hr system- every month emp increase and decrease
		
		//Where we can use static array:
		//1. book my show.com -- 200 seats
		//2. flight booking -- 300 seats
		//3. month array - 1-12
		//4. week array
		
		//Benefit of static array:
		//1. continuous memory allocation, so traversing is fast and can be use for small data size. unlike dynamic array.
		
		
		//1. Creating Array using new keyword
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
	//	i[3] = 40; 	// if you are not filling any value in int array then default value of Object Array is 0.

		
		
		System.out.println(i[0]);
		//System.out.println(i[4]);// ArrayIndexOutOfBoundsException: AIOB
		System.out.println(Arrays.toString(i));
		System.out.println(i.length);//4 to count the length of the array
		System.out.println(i);// address of the array, random string like: [I@379619aa
		
		//print values of the array one by one using for loop
		for (int k = 0; k<=3; k++) {
			System.out.println(i[k]);
//			if(i[k] == 20){ // additional logic, you can use another if under for loop and can use break as well
//				System.out.println("Hi");
//			break;
			}
		
		System.out.println("+++++++++++++++");
		//we can use short as well in the array
		
		
		short sh[] = new short[3];
		System.out.println("Length = " + sh.length);
		System.out.println("Lowest Index = " + 0);
		System.out.println("Highest Index = " + (sh.length-1));
		//by default short will be 0 if u didnt give any value to index
		System.out.println(Arrays.toString(sh));
		sh[0] = 10;
		System.out.println(Arrays.toString(sh));
		sh[2] = 40;
		System.out.println(Arrays.toString(sh));
		sh[1] = 20;
		System.out.println(Arrays.toString(sh));
		//fetch the value via For Loop
		for(int p=0; p<=sh.length-1;p++) {  //or you can write like p<sh.length
			System.out.println(sh[p]);
		}
		
		//char Array:
		char ch[] = new char[4];
		System.out.println(ch[0]);
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
	//	ch[3] = 98;// default value of char is space
		System.out.println(ch[3]);
		System.out.println(Arrays.toString(ch));
		
		//float Array
		float fh[] = new float[2];
		fh[0]= 12.33f;
		fh[1]= 100;
	    System.out.println(Arrays.toString(fh));
		
	    
	    //WAP: to store emp Data: name(string), age(int), Salary(double), gender(char), isPermanent(boolean):
		//all type of data can be store in a Object array. Property of Object array is it can store any kind of data. it comes under premitive data type
	    //Object is Super class of all the classes in the Java
	    
		
		Object empData[]= new Object[5];
		empData[0] = "Shilpa";
		empData[1] = 30;
		empData[2] = 25.55;
		empData[3] = 'f';
		//empData[4] = true;  //if you are not filling any value in Object array then default value of Object Array will be null.

		
		System.out.println(Arrays.toString(empData));
		System.out.println(empData.length);
		
		Object empData1[]= new Object[5];
		empData1[0] = "Ravi";
		empData1[1] = 35;
		empData1[2] = 25.55;
		empData1[3] = 'm';
		empData1[4] = false;
		System.out.println(Arrays.toString(empData1));

		
		//String Array:
		
		String product[] = new String[3];
		product[0] = "Macbook pro";
		product[1] = "Macbook Air";
		product[2] = "iphone";
		System.out.println(Arrays.toString(product));
		
		//print prduct using for loop
		for(int x=0; x<=product.length-1;x++) { // we have to use int because index is always in int thats why we cant use String in for loop
			System.out.println(product[x]);
			if(product[x].equals("Macbook Air")) {//if wanna right extra logic
				System.out.println("Out of Stock");
				//break;
			}
			
			System.out.println("+++++++++++++");
			
			//print above for loop on reverse order
			for(int y=product.length-1;y>=0;y--) {
				System.out.println(product[y]);
			}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	
		
		
		

	


