package Practice;

import java.util.ArrayList;
import java.util.List;

public class Reveres_A_String {
	
	public void usingBuffer()
	{
		  String S1="leej"; 
		  StringBuffer buffer = new StringBuffer();
		  buffer.append(S1); 
		  System.out.println(buffer.reverse());
		 
	}

	public void usingOwnLogic()
	{
		String S2="leej";
		char[] characterArray =S2.toCharArray();
		String reversed ="";
		for(int i=characterArray.length-1;i>=0;i--)
		{
			reversed = reversed + characterArray[i];
		}
		System.out.println(reversed);
	}

	public void usingcollections()
	{
		String S3="leej";
		char[] array =S3.toCharArray();
		List<Character> list = new ArrayList<Character>();
	}
	public static void main(String[] args)
	
	
	{
		
	}
}
