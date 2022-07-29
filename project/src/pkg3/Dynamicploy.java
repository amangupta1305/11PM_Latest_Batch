package pkg3;

public class Dynamicploy extends Staticpoly
{
  public void method(int d,int g)
  {
	  int e=d/g;
	  System.out.println("the result is " +e);
	
  }
  
  public void method(int r,String name)
	{
	 
		System.out.println("the id no is " +r + " and the clg name is " +name);
	}
    public static void main(String[] args) {
    	Dynamicploy e=new Dynamicploy();
    	e.method(24, "ayush");
	}
}
