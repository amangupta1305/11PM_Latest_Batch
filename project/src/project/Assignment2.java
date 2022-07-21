package project;

public class Assignment2 {
 
	public int sum(int a,int b) 
	{ 
		int c;
		c=a+b;
		System.out.println("The sum is " + c);
		return c;
		}
	
	public int minus(int d,int e)
	{
		int f=d-e;
		System.out.println("The minus is " +f);
		return f;
	}
	public int Multi(int g,int h)
	{
		int i=g*h;
		System.out.println("The Multi is " +i);
		return i;
	}
	public void divide(int j, int l)
	{
		int m=j/l;
		System.out.println("The divide is "  +m);
	}
	public static void main(String[] args)
	{
		Assignment2 as= new Assignment2();
		int sumresult=as.sum(10, 3);
		int sumresult1=as.sum(sumresult, 2);
		int miunresult=as.minus(sumresult1, 3);
	    int multiresult=as.Multi(miunresult, 4);
	    as.divide(multiresult, 3);
	}
}
