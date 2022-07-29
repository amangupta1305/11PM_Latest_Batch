package Pkg2;


public class ConstInheritnce {
	
	//int age;
	
	public ConstInheritnce()
	{
		this(44,55,22);
		System.out.println("Parent default Constructor");
	}
	public ConstInheritnce(int v) 
	{
		this(23,34);
		System.out.println("parent one parameterized constructor");
	}
	public ConstInheritnce(int g,int h)
	{
		this(67,78,89,90);
		System.out.println("parent two parameterized constructor");
	}
	public ConstInheritnce(int s,int d,int w)
	{
		System.out.println("parent three parameterized constructor");
	}
	public ConstInheritnce(int r,int t,int u,int o)
	{
		this();
		System.out.println("parent four petermized constructor");
	}
}
