package pkg3;

import java.util.Scanner;

public class Scannerpractise {

	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println("The sum is " +c);
		return c;
	}
	public int minus(int c,int d)
	{
		int e=c-d;
		System.out.println("The minus is " +e);
		return e;
	}
	public int multi(int e,int r)
	{
		int u=e*r;
		System.out.println("the multi is " + u);
		return u;
	}
	public void divide(int f,int h)
	{
		int l=f/h;
		System.out.println("The divide is "+l);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the value of a");
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		System.out.println("Enter the value of b");
		int x2=sc.nextInt();
		System.out.println("Enter the value of c");
	    int x3=sc.nextInt();
	    System.out.println("Enter the value of d");
	    int x4=sc.nextInt();
	    System.out.println("Enter the value of e");
	    int x5=sc.nextInt();
	    System.out.println("Enter the value of r");
	    int x6=sc.nextInt();
	    /*System.out.println("Entere the value of f");
	    int x7=sc.nextInt();
	    System.out.println("Enter the value of h");
	    int x8=sc.nextInt();*/
		
		Scannerpractise sa=new Scannerpractise();
		int addresult=sa.add(x1, x2);
		int addresult1=sa.add(addresult, x3);
		int minuresult=sa.minus(addresult1, x4);
		int multiresult=sa.multi(minuresult, x5);
		sa.divide(multiresult, x6);
	}
}
