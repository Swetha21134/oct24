package pack1;

import java.io.FileNotFoundException;

public class Tc_throw {
	
	void proc()
	{
		try
		{
			throw new FileNotFoundException("From Exception");
		}catch(FileNotFoundException e)
		{
			System.out.println("Caught inside the demo");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tc_throw obj=new Tc_throw();
		obj.proc();
		

	}

}
