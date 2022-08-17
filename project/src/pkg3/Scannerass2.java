package pkg3;

import java.util.Scanner;

public class Scannerass2 {

	public int Multi(int a,int b)
	{
		int c=a*b;
		System.out.println("the multi is " +c);
		return c;
	}
	
	public int minus(int d, int e)
	{
		int f=d-e;
		System.out.println("the minus is " +f);
		return f;
	}
	public int add(int g,int h) 
	{
		int i=g+h;
		System.out.println("the sum is " + i);
		return i;
		
	}
	public void divide(int r,int q)
	{
		int p=r/q;
		System.out.println("the divide is " +p);
	}
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int A=ob.nextInt();
		System.out.println("Enter the value of b");
		int B=ob.nextInt();
		System.out.println("Enter the value of d");
		int D=ob.nextInt();
		System.out.println("Enter the value of e");
		int E=ob.nextInt();
		System.out.println("Enter the value of g");
		int G=ob.nextInt();
		System.out.println("Enter the value of h");
		int H=ob.nextInt();
		
		Scannerass2 d=new Scannerass2();
		int multires=d.Multi(A, B);
		int miunusres=d.minus(multires, D);
		int addres=d.add(miunusres, E);
		int minusres2=d.minus(addres, G);
	    d.divide(minusres2, H);
	    
		
	}
}

