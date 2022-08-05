package pkg3;

public class Staticpoly {

	
	
	
	static int a=0;
	public void method()
	{
		 a=a+1;
		System.out.println("The value is" +a) ;
	}
	
	public static void main(String[] args) {
		Staticpoly d = new Staticpoly();
		d.method();
		
		Staticpoly de = new Staticpoly();
		de.method();
		
		Staticpoly dea = new Staticpoly();
		dea.method();
		
	}
}
	
	

