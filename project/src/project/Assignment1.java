package project;


public class Assignment1 {
	
	int age;
	int RollNo;	
	int amount;
	public void display1()

	{
		System.out.println("Welcome to All");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	 public static void main(String[] args) {
		 Assignment1 a= new Assignment1();
		 a.display1();
		 a.display2();
		 a.age=27;
		 a.RollNo=220897;
		 a.amount=23450;
		 System.out.println(a.age);
         System.out.println(a.RollNo);		
         System.out.println("The pending amount is " +a.amount);
	}

}
