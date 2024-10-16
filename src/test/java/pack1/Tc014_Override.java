package pack1;

class parent
{
	void tv()
	{
		System.out.println("This is Parent TV");
		}
	
class child extends parent
{
	
   @Override
	void tv()
	{
		System.out.println("This is child TV");
		
	}
}
	
		
public class Tc014_Override {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		child obj=new child();
		obj.tv();

	}
	
}
