package AccessModifierOutside1;
public class Accessmodifier_Protected 
extends 
AccessModifierOutside.Accessmodifier_Protected
{
	public static void main(String[] args) 
	{
		int a = 10;
		
		System.out.println(a);
		
		m1();
		m2();
		
	}
	
    protected static void m1()
	{
		System.out.println("hello");
	}
    
}