package project;

public class Assignment5 {
	
	public void print()
	{
		this.print3();
		System.out.println("Default method");
		this.print1();
	}

	public void print1()
	{
		System.out.println("One parameterized method");
		this.print2();
	}
	
	public void print2()
	{
		System.out.println("Two parameterized method");
		this.print4();
	}
	
	public void print3()
	{
		System.out.println("Three parameterized method");	
	}
	
	public void print4()
	{
		System.out.println("Fourth parameterized method");
	}
	public static void main(String[] args) {
		Assignment5 ob= new Assignment5();
		ob.print();

	}

}
