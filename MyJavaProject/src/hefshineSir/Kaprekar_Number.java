package hefshineSir;

public class Kaprekar_Number {

	public static void main(String[] args) 
	{
		
	    int	num = 99;
	    int temp=num;
	    int sq = num*num;
	    
	    int digitcnt=0;
	    while(num>0)
	    {
	    	num=num/10;
	    	digitcnt++;
	    }
	    
	    int div = (int) Math.pow(10, digitcnt);
	    int f = sq%div;
	    int s = sq/div;
	    
	    if((f+s)==temp)
	    {
	    	System.out.println("kaprekar number");
	    }
	    else
	    {
	    	System.out.println("not kaprekar number");
	    }   
	}
}
