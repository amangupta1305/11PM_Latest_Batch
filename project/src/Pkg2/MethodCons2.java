package Pkg2;

public class MethodCons2 extends MethodCons{

	public void MethodCons6() 
	{
		super.MethodCons5(11,88,99,90);
		this.MethodCons8(23, 56);
		System.out.println("Child default Method");
	}
	public void MethodCons7(int d)
	{
		System.out.println("Child 1 parameterized Method");
	}
	public void MethodCons8(int g,int h)
	{
		//super.SerialNo=12;
		//System.out.println(super.SerialNo);
		//super.Name="Aman";
		System.out.println("Child 2 parameterized Method");
		//System.out.println(super.Name);
	}
	public void MethodCons9(int h,int d,int x)
	{
		this.MethodCons6();
		System.out.println("Child 3 parameterized Method");
		this.MethodCons10(1, 5, 2, 4);
	}
	public void MethodCons10(int q,int w,int e,int r)
	{
		System.out.println("Child 4 parameterized Method");
		this.MethodCons7(89);
	}
	public static void main(String[] args) {
		MethodCons2 ob=new MethodCons2();
		ob.MethodCons9(45,12,11);
		

	}

}
