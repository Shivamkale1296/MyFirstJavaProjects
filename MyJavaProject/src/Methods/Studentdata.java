package Methods;

public class Studentdata{
	
		String name;
		int id;
		String address;
		String email;
		
	void setvalues(String n, int i, String a, String e){         //no return with args
		
		name =n;
		id=i;
		address=a;
		email=e;
	}
		
	int calculate (int s1,int s2,int s3,int s4){                //with return with args
		
		return s1+s2+s3+s4;
	}
	
	void printValues(){											//no return with no args
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(address);
		System.out.println(email);

	}
	
	
	public static void main (String [] args){
	
	Studentdata k1=new Studentdata();
	k1.setvalues ("A",1,"a","A1a");
	k1.printValues();
	System.out.println(k1.calculate (1,2,3,4));
	
	}

}