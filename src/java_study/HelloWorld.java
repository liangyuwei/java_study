package java_study;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!"); /*Try comment.*/
		double x = 1.23;
		System.out.println(x);
		System.out.println(true);
		System.out.println("true");
		System.out.println("Hello"=="hello");
		
		// Object comparison, by reference
		String s1 = "AAA";
		String s2 = "AAA";
		System.out.println("Is s1 and s2 the same object? " + (s1==s2)); // the compiler won't generate extra space for it's a waste!!!
		System.out.println("Is s1 and s2 the same object? " + s1==s2); // erroneous syntax!!! from left to right !!!
		System.out.println("Is s1 and the new String the same object? " + (s1 == new String("AAA")));
		
		// Object comparison, by value(using .equals method)
		System.out.println("Is the value of s1 equal to that of s2? " + (s1.equals(s2))); 
		
		// Assignment to s1 doesn't change s2 (they just happened to be the same when defined)
		s1 = "BBB";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("Is s1 and s2 the same object? " + (s1 == s2));
	
		// object hash code???
		System.out.println(s1.toString());
	
	}

}
