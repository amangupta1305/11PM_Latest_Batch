package project;

public class Assignment3 {

	public int div(int a,int b) 
	{
		int c=a/b;
		System.out.println("The div rssult is " +c);
		return c;
	}
	
	public int minus(int c,int d)
	{
		int e=c-d;
		System.out.println("The minus result is " +e ) ;
		return e;
	}
	
	public int sum(int f,int g) 
	{
		int h=f+g;
		System.out.println("The sum result is "+ h);
		return h;
	}
	
	public void multi(int k,int l)
	{
		int m=k*l;
		System.out.println("The multi result is "+ m);
	}
	
	public static void main(String[] args) {
		Assignment3 result=new Assignment3();
		int divresult=result.div(20, 2);
		int minuresult=result.minus(divresult, 1);
		int minusresult1=result.minus(minuresult, 3);
		int addresult=result.sum(minusresult1, 12);
		result.multi(addresult, 4);
		
	}
}

