package dec23javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTraversing {

	public static void main(String[] args) {

		ArrayList<String> footerLinksList = new ArrayList<String>();
		footerLinksList.add("Login");// 0
		footerLinksList.add("Register");// 1
		footerLinksList.add("Forgot Pwd");// 2
		footerLinksList.add("WishList");// 3

		System.out.println(footerLinksList);// [Login, Register, Forgot Pwd, WishList]
		System.out.println(footerLinksList.size());// 4
		System.out.println(footerLinksList.get(1));// Register
		System.out.println("+++++++++++");

		// Index based for-loop with the index printing
		int count = 0;
		for (int i = 0; i <= footerLinksList.size() - 1; i++) {
			System.out.println(count + " " + footerLinksList.get(i));
			count++;
		}
		System.out.println("+++++++++++");

		// for each loop
		for (String e : footerLinksList) {
			System.out.println(e);
		}
		System.out.println("+++++++++++");

		// Order based collection or Array List it always maintain order.
		ArrayList<String> pageList = new ArrayList<String>();
		pageList.add("Register");// 0
		pageList.add("Forgot Pwd");// 1
		pageList.add("WishList");// 2
		pageList.add("pwd");// 3

		// pageList.add(5, "contact us");//we can not miss index order, otherwise it
		// will give compile time as error as IOB
		// System.out.println(pageList);

		pageList.add(2, "Hello"); // it will add the value at 2 index .add method will just add the data,no loss
									// of data
		System.out.println(pageList);

		// we can update the data as well in the arrayList index like:
		// pageList.set(3, "Yogesh"); //instead of wishList on index 3 now Yogesh will
		// be updated
		// System.out.println(pageList);

		// we can remove the value as well.

		pageList.remove(2);
		System.out.println(pageList.get(2));
		System.out.println("+++++++++++");

		// no need to write add again and again
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "firefox", "edge"));
		System.out.println(browserList.size());
		browserList.add("IE");
		System.out.println(browserList.size());
		System.out.println(browserList.get(0));

		// another way of writing arraylist
		ArrayList<String> List = new ArrayList<String>() {
			{
				add("one");
				add("two");
				add("three");
			}

		};
		
		System.out.println(browserList.indexOf("naveen")); //-1   // to find the index 
		System.out.println(browserList.indexOf("firefox"));//1

		if(browserList.indexOf("naveen")== -1) {
			System.out.println("Please pass the right browser name");
		}
		
		//
		System.out.println(browserList);
		//browserList.removeAll(browserList);  // remove the browserlist
		System.out.println(browserList);//empty list
		System.out.println(browserList.size());//0

		//
		ArrayList<String> osList = new ArrayList<String>(Arrays.asList("wondow", "mac", "linux"));
		browserList.addAll(osList); //with this method we can combine multiple array list
		System.out.println(browserList); //browser+os
		System.out.println(osList);
		browserList.removeAll(osList);
		System.out.println(browserList);//browser
		
		osList.add("Testing"); // will go in last index	
		System.out.println(osList);
		System.out.println("+++++++++++");
		
		//
		if(osList.contains("mac")) {
			System.out.println("TestPassed");
		} else {
			System.out.println("Test Failed");
		}
		
		ArrayList<String> subList = new ArrayList<String>(Arrays.asList("mac", "linux"));
        System.out.println(osList.containsAll(subList));

		System.out.println("+++++++++++");
		//it will short the list
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10,20,30,70,50,80,90));
		System.out.println(numList);//[10, 20, 30, 70, 50, 80, 90]
		Collections.sort(numList);
		System.out.println(numList);//[10, 20, 30, 50, 70, 80, 90]


		
	}
}
