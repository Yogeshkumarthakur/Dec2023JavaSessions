package dec23javasessions;

public class DataTypeCasting {

	public static void main(String[] args) {

		//widening: converting a lower data type into higher data type
		
		//byte short char int long float double
		// <----------------------------------->
		
		byte t = 10;
		int k = t;
		System.out.println(k);
		
		//narrowing: converting a higher data type into lower data type
		int p = 150;
		byte q = (byte)p;
		System.out.println(q);
		
		//normal widening long into int
		long l = p;
		System.out.println(l);
		
		
		//widening long into float we are storing
		long L1 = 1000;
		float f1 = L1;
		System.out.println(f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
