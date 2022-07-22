package Pkg2;

import project.Assignment5;

public class One {
	
	public void print1()
	{
		
		this.print3();
		System.out.println("Default method");
		
	}

	public void print1(int a)
	{
		System.out.println("One parameterized method");
		this.print2();
		
	}
	
	public void print2()
	{
		System.out.println("Two parameterized method");
		
	}
	
	public void print3()
	{
		System.out.println("Three parameterized method");
		this.print1(7);
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
