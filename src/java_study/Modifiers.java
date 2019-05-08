package java_study;

public class Modifiers {

	public static void main(String[] args)
	{
		Modifiers modifiers = new Modifiers();
		modifiers.pri_method();
	}
	
	public void pub_method()
	{
		System.out.println("This is a public method.");
	}
	
	private void pri_method()
	{
		System.out.println("This is a private method.");
	}
	
	protected void pro_method()
	{
		System.out.println("This is a protected method.");
	}
	
	void def_method()
	{
		System.out.println("This is a default method.");
	}
	
}
