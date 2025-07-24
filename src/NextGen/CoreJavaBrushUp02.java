package NextGen;

public class CoreJavaBrushUp02 {

	public static void main(String[] args) {

		// String is an object // String literal
		// create only one object in memory just bcoz of key_value is same for both
		// variable.

		String S = "Rahul Shetty Acedamy";
		String S1 = "Rahul Shetty Acedamy";

		// New keyword
		// Create new memory for both variable bcoz of New keyword

		String S2 = new String("welcome");
		String S3 = new String("welcome");

		String s = "Rahul Shetty Academy ";
		System.out.println(s);

		System.out.println("****************************");

		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);

		System.out.println("****************************");

		String s1 = "Rahul Shetty Academy ";
		String[] splittedString1 = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);

		// Trim for remove the white spaces
		System.out.println(splittedString[1].trim());

		System.out.println("****************************");

		// Print the Character

		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));

			System.out.println("****************************");
			
			// Print reverse Character:-
		for( int i1 = s1.length()-1 ; i1>=0 ; i1--) {
			System.out.println(s1.charAt(i1));
		}
		
		}

	}

}
