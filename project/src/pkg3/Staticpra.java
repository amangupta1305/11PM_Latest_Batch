package pkg3;

import java.util.Scanner;

public class Staticpra {
	
	static int Result;
	int id;
	static int year;
	String Name;
	 static String university="RGPV";
	
	public static void stamethod(int a)
	{
		
		System.out.println("the university is " + university);
	}
        
	public void Nonstatic(int ID, int Year, String name)
	{
		 id= ID;
		 year=Year;
		 Name=name; 
		 System.out.println("Aman has completed this degreee in " +Year + " and id was " + ID +" And clg name was " + name);
		 //Staticpra.stamethod(2);
	}
	
	public static void main(String[] args) {
		Staticpra ob2=new Staticpra();
		ob2.Nonstatic(11,2016,"IITM");
		Staticpra.Result=456;
		System.out.println(Staticpra.Result);
		Staticpra.stamethod(12);
		
		
		
		
		
	}
        
		

}