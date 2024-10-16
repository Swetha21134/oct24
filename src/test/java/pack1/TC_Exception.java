package pack1;

public class TC_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try
{

	String str=null;
	str.equals("Hello");
	System.out.println("Hello");
	System.out.println("welcome");
	
	int a=0;
	int b=30/a;
}
catch( NullPointerException e)
{
	System.out.println(e.getMessage());
	System.out.println(e.toString());
	
}
catch(ArithmeticException e1)
{
	System.out.println(e1.getMessage());
	System.out.println("Hello1");
	System.out.println("welcome1");
}


}

}


