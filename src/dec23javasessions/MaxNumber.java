package dec23javasessions;

public class MaxNumber {

	public static void main(String[] args) {
		// find out the max no?
		// false and false = false, true and true = true, true and false = false.
		// if u use single "&" it will check all the condition but if you use "&&" then
		// it will short circuit
		// if 1st condition is false it didn't goto the 2nd condition

//		int a = 100;
//		int b = 200;
//		int c = 300;
//	
//		if(a>b && a>c) {  //false && false (it will short circuit)
//			System.out.println("a is the greatest no");
//		}
//		else if (b>c) {
//			System.out.println("b is the greates no");
//		}
//		else {
//			System.out.println("c is the greatest");
//		}

		System.out.println("------------");

		// now find max no out of 4 numbers
//		int a = 100;
//		int b = 200;
//		int c = 300;
//		int d = 400;
//	
//		
//		if(a>b && a>c && a>d) { 
//			System.out.println("a is the greatest no");
//		}
//		else if (b>c && b>d) {
//			System.out.println("b is the greates no");
//		}
//		else if (c>d) {
//			System.out.println("c is the greates no");
//		}
//		else {
//			System.out.println("d is the greatest");
//		}

		System.out.println("------------");

		// now find max no with greater and equal sign together for 4 numbers
		int a = 100;
		int b = 200;
		int c = 400;
		int d = 400;

		if (a >= b && a >= c && a >= d) {
			System.out.println("a is the greatest no");
		} else if (b >= c && b >= d) {
			System.out.println("b is the greates no");
		} else if (c >= d) {
			System.out.println("c is the greates no");
		} else {
			System.out.println("d is the greatest");
		}

		// like (& means keep checking all the conditions and && short circuit operator
		// Similarly we have || (both of them) and |(either of them means keep checking
		// all the conditions)

//		//
//		int marks = 100;
//		if (marks <= 100) {
//			if (marks >= 80 && marks <= 90) { // true && false
//				System.out.println("Grade A");
//			} else {
//				System.out.println("Grade B");
//			}
//
//		}
//
//	}

		//
//		int marks = 85;
//		if (marks <= 100) {
//			if (marks >= 80 && marks <= 90) { // true && true
//				System.out.println("Grade A");
//			} else {
//				System.out.println("Grade B");
//			}
//
//		}
//
//	}

//		//
//		int marks = 95;
//		if (marks <= 100) {
//			if (marks >= 80 && marks <= 90) { // true && true
//				System.out.println("Grade A");
//			} else {
//				if (marks >= 95) {
//					System.out.println("Grade A++");
//				}
//
//			}
//
//		}
		
//		//
//		int marks = 100;
//		if (marks <= 100) {
//			if (marks >= 80 && marks <= 90) { // true && true
//				System.out.println("Grade A");
//			} else {
//				if (marks >= 95) {
//					System.out.println("Grade A++");
//					if (marks >=100) {
//						System.out.println("elegible for scholarship");
//					}
//				}
//
//			}

//		//
//		int marks = 101;
//		if (marks <= 100) {
//			if (marks >= 80 && marks <= 90) { // true && true
//				System.out.println("Grade A");
//			} else {
//				if (marks >= 95) {
//					System.out.println("Grade A++");
//					if (marks >=100) {
//						System.out.println("elegible for scholarship");
//					}
//				}
//
//			}
		
		//
		int marks = 0;
		if (marks <= 100) {
			if (marks >= 80 && marks <= 90) { // true && true
				System.out.println("Grade A");
			} else {
				if (marks >= 95) {
					System.out.println("Grade A++");
					if (marks >=100) {
						System.out.println("elegible for scholarship");
					}
				}else {
					if(marks>=0 && marks<=10) {//TRUE AND TRUE
						System.out.println("Failed");
					}
					
				}

			}
			
			// button on the page
			//1. isVisible
			//2. isEnable
			//3. isClicable
			
			//if(isVisible & isEnables & isClicable)   //good choice it will check all conditions
			//if(isVisible && isEnables && isClicable) //bad choice if first cond true than only it will check other cond else Scircuit
			//if(isVisible | isEnables | isClicable)   //bad choice
			//if(isVisible || isEnables || isClicable) //bad choice if first cond true than only it will check other cond else Scircuit
			
		}

	}
}
