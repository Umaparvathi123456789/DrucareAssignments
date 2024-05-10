package task;

public class PrintNumber {
	public void printn(int a) 
	{
		System.out.println("Integer : "+a);
	  
	}
	public void printn(float f) 
	{
		System.out.println("Float : "+f);
	  
	}
	public void printn(double d) 
	{
		System.out.println("Double : "+d);
	  
	}
	public void printn(String str) 
	{
		System.out.println("String : "+str);
	  
	}
	public static void main(String[] args) {
	
		   PrintNumber a=new PrintNumber();
	       a.printn(7);
	       a.printn(3.14f);
	       a.printn(25.9);
	       a.printn("Anusha Reddy");
		}

	}

