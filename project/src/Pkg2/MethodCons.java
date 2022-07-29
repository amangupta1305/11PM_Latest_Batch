package Pkg2;

public class MethodCons {
	
	 //int SerialNo;
	 //String Name;

	public void MethodCons1()
	{
		this.MethodCons4(3,4,5);
		System.out.println("Parent default Method");
	}
	public void MethodCons2(int r)
	{
		System.out.println("Parent 1 parameterized Method");
	}
	public void MethodCons3(int r, int e)
	{
		System.out.println("Parent 2 parameterized Method");
		this.MethodCons2(41);
	}
	public void MethodCons4(int h,int u,int o)
	{
		System.out.println("Parent 3 parameterized Method");
	}
	public void MethodCons5(int l,int z,int c,int v)
	{
		this.MethodCons1();
		System.out.println("Parent 4 parameterized Method");
		this.MethodCons3(56, 54);
	}
}

