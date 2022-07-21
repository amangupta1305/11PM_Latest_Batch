package project;

public class Assignment4 {
	
	public Assignment4()
	{
		this(45,75,96);
		System.out.println("Dafault constructor");
	}
	public Assignment4(int v) 
	{
		this();
		System.out.println("One parameterized Constructor");
	}
	public Assignment4(int g, int h) 
	{
		 this(78);
		System.out.println("Two parameterized constructor");
	}
	public Assignment4(int w,int b, int c)
	{
		System.out.println("Third pameterized Constructor");
	}
	public Assignment4(int h, int r, int e,int w)
	{
		this(9,8);
		System.out.println("Fourth parameterized constructor");
	}
    
	
	public static void main(String[] args) {
		Assignment4 ob= new Assignment4(5,6,7,8);
		
		
	}

}
