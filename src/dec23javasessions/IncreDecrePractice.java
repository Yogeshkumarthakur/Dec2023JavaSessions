package dec23javasessions;

public class IncreDecrePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 11, b = 22, c;
		 c = a + b + a++ + b++ + ++a + ++b;
		 System.out.println("a=" + a);//13
		 System.out.println("b=" + b);//24	
		 System.out.println("c=" + c);//103
		 
		 		 
//		 int i = 0;
//		 int j = i++ - --i + ++i - i--;
//		 System.out.println(j);
		 
		 
		 int i = 19, j = 29, k = 0;
		 int m = i-- - j-- - k--;
		 
		 System.out.println("i=" + i);//18
		 System.out.println("j=" + j);//28
		 System.out.println("k=" + k);//-1
	     System.out.println("m=" + m);//
	
}

}
