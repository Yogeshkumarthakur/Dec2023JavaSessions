package dec23javasessions;

import java.util.Arrays;

public class ArraysLiterals {

	public static void main(String[] args) {
		// Static arrays using Array literals: when u already knows the value to store:
		
		int i[] = {10,20,30,40,1};
		System.out.println(i[0]);
		System.out.println(Arrays.toString(i));
		System.out.println(i.length);//5
		//System.out.println(i[i.length]);//AIOB
		
		
		//char array using literals
		char ch[] = {'a','e','i','o','u'};
		System.out.println(ch[0]);
		
		for(int k=0;k<=ch.length-1;k++) {
			System.out.println(ch[k]);
			
		}
		System.out.println("++++++++");

		
		//String array using literals
		String product[] = {"imac","macbook","canon"};
		System.out.println(Arrays.toString(product));
		System.out.println("++++++++");

		//Object array using literals
        Object data[] = {"Sony",24,25.22,'m',true};
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));
		
		
		
	}

}
