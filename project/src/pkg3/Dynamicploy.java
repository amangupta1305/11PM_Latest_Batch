package pkg3;

public class Dynamicploy extends Staticpoly
{
	public static void m1(int g)
	{
		System.out.println("i am the static method of child class");
	}
	public static void main(String[] args) {
		Dynamicploy g=new Dynamicploy();
		g.m1(7);
	 }
}
