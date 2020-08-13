package Task7;
import java.util.*;
public class ShortMapKey {
	
		static Map<String, Integer> map = new HashMap<>(); 

		public static void sortbykey() 
		{ 
			ArrayList<String> sortedKeys = 
						new ArrayList<String>(map.keySet()); 
			
			Collections.sort(sortedKeys); 

			for (String x : sortedKeys) 
				System.out.println("Key = " + x + 
							", Value = " + map.get(x));	 
		} 
		
		// Driver Code 
		public static void main(String args[]) 
		{ 
			// putting values in the Map 
			map.put("Bhavin", 80); 
			map.put("Aditya", 90); 
			map.put("Sunny", 80); 
			map.put("Indi", 75); 
			map.put("Sandeep", 40); 

			// Calling the function to sortbyKey 
			sortbykey(); 
		
	} 

}
