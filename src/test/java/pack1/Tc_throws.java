package pack1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tc_throws {
	
	static void fileopen1() throws FileNotFoundException
	{
		System.out.println("Inside the method");
		FileReader fd=new FileReader("text123.txt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			fileopen1();
		}
		catch(Exception e)
		{
			System.out.println("Throws:"+e.getMessage());
		}

	}

}
