package pack1;

class swipeMachine 1

{
	void readcard()
	{
		System.out.println("readcard from parent");
		
	}
	
	
 class chipcardmachine extends swipeMachine 1

 {
	void readcard()
	{
			System.out.println("Readcard from child");
			
	}
 }
	
	public class swipemachine {
		public static void main(String[] args) {
			
			swipeMachine obj1=new swipeMachine();
			obj1.readcard();
			obj1=new swipeMachine();
			obj1.readcard();
			
			
			
		}

   }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
