package pack1;

public class tC0013_Overloading {
	
	tC0013_Overloading()
	{
		System.out.println("constructor without parameter");
		
	}
	 tC0013_Overloading(int value)
	 {
		 System.out.println("constructor without parameter:"+value); 
	 }
	 
	 tC0013_Overloading(int value1,int value2)
	 {
		 tC0013_Overloading obj1=new tC0013_Overloading("constructor with parameter:"+value);
	 }
	 
	 public static void main(string[]args)
	 {
		 tC0013_Overloading obj=new tC0013_Overloading();
		 
		 tC0013_Overloading obj1=new tC0013_Overloading(5000);
		 
		 tC0013_Overloading obj2=new tC0013_Overloading(5000,6000);
		 
	 }
	 
	

}
