package dec23javasessions;

public class Loops {

	public static void main(String[] args) {

		// 1. while loop
		/*
		 * Use case of while loop
		 * 1. when no of iteration is not fixed
		 * ex: 
		 * 1. wait for web element on the page: 5,10,15,3,30
		 * 2. Wiat for page loading: 1,5,10,15,4
		 * 3. dropdown value are dynamic some time: 5,10,15
		 * 4. webtable pagination
		 * 5. carousals section
		 * 6. datepicker
		 * 7. page scrolling: infinite scrolling
		 */

		int i = 1; // start initiallization part
		while (i <= 10) { // conditional part
			System.out.println(i);// statement part
			i++;
			// break; // we can use break here entire while loopwill be break after priting
			// 1
		}

		// example of infinite loop
//		while(true) {
//			System.out.println("Welcome to Taj");
//		}

		//
		int p = 1;
		while (p <= 100) {
			System.out.println(p);
			if (p % 5 == 0) {
				System.out.println("Hi");
				// break; // we can use break here entire while loop will disconnected not just
				// the if condition
			}
			p++;
		}

		// using of ! sign

		boolean flag = true;
		while (!flag) {
			System.out.println("Hello");
		}
		
		// we can define the range as well in the while loop
		
		int total =60;
		while(total>=50 && total <=100) {
			System.out.println("Testing");
			total --;
		}
		System.out.println("++++++++++");
		
		
		//2. for loops
		/*
		 * Use case of while loop
		 * 1. when no of iteration is fixed
		 * ex: 
		 * 1. static dropdown; month 1-12
		 * 2. Arrays: fixed size
		 * 3. Header footer links
		 * 4. reading data from excel sheet reading 1 to 10 rows
		 */
		 
		//print 1 to 10 
		
		for(int k=1;k<=10;k++) {
			System.out.println(k);
		}
		System.out.println("++++++++++");

		
		
		//infinite loop interview question
//		for(; ;) {
//			System.out.println("Bye");
		//break
//		}
		System.out.println("++++++++++");

		//
		for(byte b = 1; b<=5; b++) {
			System.out.println(b);
		}
		System.out.println("++++++++++");

		
		//
		for(float h=1.0f;h<=5.5;h++){
				System.out.println(h);
		}
				System.out.println("++++++++++");

				
		//print a-z
		for (char ch='a';ch<'z'; ch++) {
			System.out.println(ch);
			//System.out.println(ch + "=" +(byte)ch);
		}
		System.out.println("++++++++++");

		
		//print A-Z
        for(char cap='A';cap<='Z';cap++) {
        	System.out.println(cap);
        }
        
        //priting string along with no
        for(int p1=0;p1<=5;p1++) {
        	System.out.println("Hello World " + p1);
        }
		
        //print 10-1 in for loop
        for(int l=10;l>=1;l--) {
        	System.out.println(l);
        }
        System.out.println("++++++++++");
        
        //print odd no using for loop
        for(int odd=1;odd<=10;odd++) {
        	System.out.println(odd);
        	odd++;
        	//odd=odd+2;
        }
        System.out.println("++++++++++");
        
        //print even no using for loop
        for(int odd=2;odd<=10;odd++) {
        	System.out.println(odd);
        	odd++;
        	//odd=odd+2;
        }
        System.out.println("++++++++++");
        
        
        
        
        
        
        //DO WHILE LOOP: print 1 to 10
        //at least statement execute 1 time on do while loop
        int d=1;
        do {
        	System.out.println(d);
        	d++;
        }
        while(d<=10);
        
        //usecase: if element is present on the page then click on it and break
        
		
		}
	}

