package Inheritance;

class A
{
	void display() 
	{
		System.out.println("in A class");	
	}
}
class B
{
	void display() 
	{
		System.out.println("in  class");		
	}
}

public class Single_level_inheritance 
{
	
	public static void main(String[] args) 
	{
		B b = new B();
		b.display();



	}
}
