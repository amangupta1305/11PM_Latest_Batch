package Pkg2;

public class ConstInheritnce1 extends ConstInheritnce{
	
	public ConstInheritnce1()
	{
		this(12,23);
		System.out.println("Child default Constructor");
	}
	public ConstInheritnce1(int o)
	{
		this(3,4,5,6);
		System.out.println("Child One parameterized Constructor");
	}
	public ConstInheritnce1(int e,int q)
	{
		super(3);
		System.out.println("Child two parameterized Constructor");
	}
	public ConstInheritnce1(int x,int f,int g)
	{
		this();
		System.out.println("Child three parameterized Constructor");
	}
    public ConstInheritnce1(int j, int k,int m,int n)
    {
    	this (7,8,1);
    	System.out.println("Child four parameterized Constructor");
    }
    public static void main(String[] args) {
    	ConstInheritnce1 ob= new ConstInheritnce1(5);
	}
}
