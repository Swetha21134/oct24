package pack1;

abstract class shape
{
	abstract void draw();
	abstract void paint();
}

class rect extends shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Drawing");
		
	}

	@Override
	void paint() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");

		
		
	}
	
}

public class TC_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape r1=new rect();
		r1.draw();
		r1.paint();
		

	}

}

