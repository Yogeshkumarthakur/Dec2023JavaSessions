package dec23javasessions;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// ArrayList: default class in java already, it will create dynamic array for us
		
		
		ArrayList ar =  new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar);//[100, 200] to print value of ArrayList simply write (syso-ar)
		System.out.println(ar.size());//2
		ar.add(300);//3
		ar.add(400);//4
		System.out.println(ar.size());//4
		ar.add(500);//5
		ar.add(600);//6
		System.out.println(ar);//[100, 200, 300, 400, 500, 600]

		System.out.println(ar.size());//6
		ar.remove(5);
		System.out.println(ar.size());//5 reduced size

		// we can add duplicate value as well in the arraylist
		ar.add(300);
		System.out.println(ar);//[100, 200, 300, 400, 500, 300]
		
		//we are getting raw type aaray list warning bcoz we can add any type of data in arraylist:
		ar.add(12.33);
		ar.add('m');
		ar.add(true);
		ar.add("Hello");
		System.out.println(ar);//[100, 200, 300, 400, 500, 300, 12.33, m, true, Hello]

		//marklist--Generic: int -> Integer 
		//Always use full name in genrics like Boolean, Integer, Float etc...

		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(100);
		System.out.println("+++++++++");
		
		//empList -- Generic - String
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Yogesh");
		empNamesList.add("Naveen");
		System.out.println(empNamesList);//[Yogesh, Naveen]--to find the values in arraylist
		System.out.println(empNamesList.size());//2-- To find the size of arraylist
		
		
		//emp info -- name, age, salary, isActive, gender
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("tom");//0
		empDataList.add(34);//1
		empDataList.add(23.33);//2
		empDataList.add(true);//3
		empDataList.add('M');//4
		empDataList.add(null);//5 we can add null also
		System.out.println(empDataList);//[tom, 34, 23.33, true, M, null]
		System.out.println(empDataList.size());//6
		
		//we can give virtual capacity by ourself as well
		//ArrayList vc = new ArrayList(5);
		//loadFactor pc/2
		//vc=Pc/2
		//vc=--10+5+7+11
		
		
		
	}

}
