package java_study;


public class SimpleExampleWErrorHandling {
	private int number;
	
	public SimpleExampleWErrorHandling() {}

	// main entry point
	public static void main(String[] args) {
		/*
		for (int i=0; i<10; i++) {
			// note that here example is an object of class SimpleExample!!!
			SimpleExample example = new SimpleExample();
			
			if(i<=5) {
				try {example.setValue(i);}
				catch(Exception e) {e.printStackTrace();}
			}
			else {
				try {example.setValue(i*10);}
				catch(Exception e) {e.printStackTrace();}
			}
		
			System.out.println("SimpleExample #"+i+"'s value is "+example.getNumber());
		
		}
		*/
		showErrorHandling();
		
	}
	
	public int getNumber() {
		return number;
	}
	
	// Show error handling
	public static void showErrorHandling() {
	
		try {
			System.out.println();
			System.out.println("SimpleExample BadVale Error Case: ");
			
			//SimpleExample example = new SimpleExample();
			SimpleExampleWErrorHandling example = new SimpleExampleWErrorHandling();
			example.setValueWithException(-10);
			System.out.println("SimpleExample BadValue's value is "+example.getNumber());
			
		} catch(Exception e) {
			System.err.println("SimpleExample BadValue Error Case threw an exception");
			e.printStackTrace();
		} finally {
			System.out.println("SimpleExample BadVaule Error Finally Called.");
		}
	}
	
	// setValue with exception
	// should the naming convention be fixed??
	public void setValueWithException(int val) throws Exception{
		if(val < 0) throw new Exception("setValue Exception - Value that is set is Negative!");
		
		System.out.println("The code after throwing an exception is still executed...");
		number = val;		
	}


}


