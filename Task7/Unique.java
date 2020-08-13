package Task7;

import java.util.*; 

class Unique { 
	final static int  MAX_CHAR = 256; 

	boolean uniqueCharacters(String str) 
	{ 
		// If length is greater than 256, 
		// some characters must have been repeated 
		if (str.length() > MAX_CHAR) 
			return false; 

		boolean[] chars = new boolean[MAX_CHAR]; 
		Arrays.fill(chars, false); 

		for (int i = 0; i < str.length(); i++) { 
			int index = (int)str.charAt(i); 

			/* If the value is already true, string 
			has duplicate characters, return false */
			if (chars[index] == true) 
				return false; 

			chars[index] = true; 
		} 

		/* No duplicates encountered, return true */
		return true; 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Unique obj = new Unique(); 
		String input = "Bhavin"; 

		if (obj.uniqueCharacters(input)) 
			System.out.println("The String " + input 
							+ " has all unique characters"); 
		else
			System.out.println("The String " + input 
							+ " has duplicate characters"); 
	} 
} 
