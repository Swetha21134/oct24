package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tc_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputstr="Apple";
		String pattern="Apple";
		boolean paternmatch=Pattern.matches(pattern, inputstr);
		
		System.out.println("Pattern match is:"+paternmatch);
		
		
		String input="Shop,Mop,Hopping,Chopping";
		Pattern p1=Pattern.compile("hop");
		Matcher m1=p1.matcher(input);
		
		System.out.println(m1.matches());
		
		while(m1.find())
		{
			System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
		}
		
		String input1="Exo1";
		Pattern p2=Pattern.compile("^[A-Z][a-z][a-z][0-9]$");
		Matcher m2=p2.matcher(input1);
		if(!m2.find())
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("notFound");
		}
		
		
		String email="swethayanala92@gmail.com";
		Pattern p3=Pattern.compile("^[\\w._]+@[\\w]+\\.[\\w.]{3}$");
		Matcher m3=p3.matcher(email);
		if(!m3.find())
		{
			System.out.println("email found");
			System.out.println(m3.group()+":"+m3.start()+":"+m3.end());
			
		}
		else
		{
			System.out.println(" email notFound");
			System.out.println(m3.group()+":"+m3.start()+":"+m3.end());
			
		}
		
		
	// digit pattern
		
		String in1="1234567890";
		
		Pattern p4=Pattern.compile("^\\d{10}$");
		Matcher m4=p4.matcher(in1);
		if(m4.find())
		{
			System.out.println("mobile number matched");
		}
		else
		{
			System.out.println("mobile number not matched");
		}
		
		// Non Digit pattern
		
String in2="adcghjerty";
		
		Pattern p5=Pattern.compile("^\\D{10}$");
		Matcher m5=p5.matcher(in2);
		if(m5.find())
		{
			System.out.println("Non digit matched");
		}
		else
		{
			System.out.println(" Non digit not matched");
		}
		
		
		//white Space pattern
		
 String in3="welcome swetha";
		
		Pattern p6=Pattern.compile(".*\\S.*");
		Matcher m6=p6.matcher(in3);
		if(m6.find())
		{
			System.out.println("white space matched");
		}
		else
		{
			System.out.println(" white space not matched");
		}
		
		//white space pattern
		
		
String in4="welcome swetha";
		
		Pattern p7=Pattern.compile("\\s");
		Matcher m7=p7.matcher(in4);
		while(m7.find())
		{
			System.out.println(m7.group()+":"+m7.start()+":"+m7.end());
		}
		
		//Beginning of the line 
		
String in5="welcome swetha hi";
		
		Pattern p8=Pattern.compile("^welcome");
		Matcher m8=p8.matcher(in5);
		if(m8.find())
		{
			System.out.println(m8.group()+":"+m8.start()+":"+m8.end());
			System.out.println("Beginning of the line matched");
		}
		else
		{
			System.out.println("  Beginning of the line not matched");
		}
		
		
		// Beginning of the line  and end of the line
		
		
String in6="welcome swetha hi";
		
		Pattern p9=Pattern.compile("^welcome.* hi$");
		Matcher m9=p9.matcher(in6);
		if(m9.find())
		{
			System.out.println(m9.group()+":"+m9.start()+":"+m9.end());
			System.out.println("Beginning of the line matched");
		}
		else
		{
			System.out.println("  Beginning of the line not matched");
		}
		
		
		
		
		
		
		
		
		
		
		
	
			}

}
