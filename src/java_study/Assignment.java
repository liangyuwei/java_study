package java_study;

class Number{
	int i;
}

public class Assignment{
	public static void main(String[] args) {
		// Initialize an object of Number class
		Number n1 = new Number();
		Number n2 = new Number();
		// Assign two integers
		n1.i = 1;
		n2.i = 2;
		// Print the two numbers
		System.out.println("1: n1.i = " + n1.i + ", n2.i = " + n2.i);
		// Print two numbers after assignment
		n1 = n2; // object assignement is by ***reference*** !!!
		System.out.println("2: n1.i = " + n1.i + ", n2.i = " + n2.i);
		// Print two numbers after value assignemnt
		n1.i = 3;
		System.out.println("3: n1.i = " + n1.i + ", n2.i = " + n2.i);
		
	}
}

