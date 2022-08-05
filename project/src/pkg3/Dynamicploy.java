package pkg3;

public final class Dynamicploy extends Staticpoly
{
	public void m1(int g)
	{
		System.out.println("i am the static method of child class");
	}
	public static void main(String[] args) {
		Dynamicploy g=new Dynamicploy();
		g.m1(7);
	 }
}
