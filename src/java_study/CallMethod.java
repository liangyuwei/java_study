package java_study;

public class CallMethod {

	public static void main(String[] args)
	{
		// Instantiate an object
		Modifiers modifiers = new Modifiers(); // default constructor

		// Call methods
		System.out.println("Calling public method...");
		modifiers.pub_method();
		
		System.out.println("Calling protected method...");
		modifiers.pro_method();
		
		//System.out.println("Calling private method...");
		//modifiers.pri_method(); // caused erros
 		
		System.out.println("Calling default method...");
		modifiers.def_method();
		
		//System.out.println("5/2 = " + (5/2));
	}
	
}
