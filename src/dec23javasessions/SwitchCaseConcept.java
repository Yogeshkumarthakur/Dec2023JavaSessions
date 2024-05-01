package dec23javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome browser");
			break;
		case "firefox":
			System.out.println("launch firefox browser");
			break;
		case "edge":
			System.out.println("launch edge browser");
			break;
		case "safari":
			System.out.println("launch safari browser");
			break;

		default:
			System.out.println("Please pass the right browser");
			break;
		}
// we can use Switch case only with integer char stirng and enum
		
		// switch case with small letter aeiou
		char c = 'b';
		
		switch (c) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;

		default:
			System.out.println(c + " is a constant");
			break;
		}
		
		// switch case with Capital letter AEIOU
		char d = 'c';
		switch (d) {
		case 'A':
			System.out.println("A is a vowel");
			break;
		case 'E':
			System.out.println("E is a vowel");
			break;
		case 'I':
			System.out.println("I is a vowel");
			break;
		case 'O':
			System.out.println("O is a vowel");
			break;
		case 'U':
			System.out.println("U is a vowel");
			break;

		default:
			System.out.println(d + " is a constant");
			break;
		}
	}
	


}
