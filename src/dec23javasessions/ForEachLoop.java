package dec23javasessions;

public class ForEachLoop {

	public static void main(String[] args) {
		// we can use, for-each loop with any types of array like: new keyword base
		// Array or
		// array literals

		int i[] = { 10, 20, 30, 40, 1 };

		// 1. index based for loop:
		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);
		}
		System.out.println("++++++++++");

		// 1. For each /Advance for loop:
		for (int e : i) {
			System.out.println(e);
		}
		System.out.println("++++++++++");

		// double array literals with advance for loop
		double d[] = { 12.33, 1.1, 2.3, 4.5 };
		for (double e : d) {
			System.out.println(e);
		}
		System.out.println("++++++++++");

		
		//String array literals
		String s[] = {"Macbook", "iphone", "i watch"};
		for(String e: s) {
			System.out.println(e);
			//break // we can use break as well it will break after printing Macbook
		}
		System.out.println("++++++++++");

		//object array literals
        Object data[] = {"Sony",24,25.22,'m',true};
        for(Object e: data) {
        	System.out.println(e);
        }
		System.out.println("++++++++++");

        
        // we can print index as well by using for each loop like below:
		int num[] = { 10, 20, 30, 40, 1 };
		
    	int count = 0;
    	for(int e : num) {
    		System.out.println(count + "--" + e);
    	count ++;
    	}
		System.out.println("++++++++++");

		//reverse order with for each loop:
		
		int l[] = {10,20,30,40};
		count = l.length-1;
		for (int e : l) {
			System.out.println(count + " " +l[count]);
			count --;
		}
		System.out.println("++++++++++");

		
		
		//short
		short sh[] = {100,200,322,344};
		for(short e :sh) {
			System.out.println(e);
		}
		System.out.println("++++++++++");

		
		//a-z
		char c[] = {'a','b','c'};
		for(char e : c) {
			System.out.println(e);
		}
		System.out.println("++++++++++");

		
		//a-z print asci value for below no and should be 48 to 57
		count = 0;
		char cha[] = {'0','1','2','3','4','5','6','7','8','9'};
		for(int e : cha) {
			System.out.println(count + "-" +   e);
		}
    	
		System.out.println("++++++++++");

    	
    	
    	


	}

}
