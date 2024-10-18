package pack1;

import java.util.Hashtable;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TC_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,Double> ht=new Hashtable<String,Double>();
		ht.put("Arun", 34.55);
		ht.put("shivababa", 44.55);
		ht.put("shiva", 60.55);
		
		System.out.println(ht);
		System.out.println(ht.values());
		
		
		
		
		

	}

}
