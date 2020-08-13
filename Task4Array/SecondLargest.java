package Task4Array;
import java.util.Arrays;
public class SecondLargest {

	
	public static void main(String[] args) {
	int[] my_array = {
	            10789, 2045, 1899, 1456, 2013, 
	            1459, 2458, 1454, 1472, 2365, 
	            1456, 2165, 1457,4000};
	System.out.println("Original numeric array : "+Arrays.toString(my_array));            
	Arrays.sort(my_array);
	int index = my_array.length-1;
	while(my_array[index]==my_array[my_array.length-1]){
	index--;
	}
	System.out.println("Second largest value: " + my_array[index]);
	}
	}


