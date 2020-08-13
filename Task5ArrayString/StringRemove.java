package Task5ArrayString;


	import java.util.*;
	import java.util.StringTokenizer;

	class StringRemove {
	@SuppressWarnings("resource")
	public static void main(String a[]){
	   Scanner sc=new Scanner(System.in);
	  
	String str = sc.nextLine();
	  
	  

	StringTokenizer st = new StringTokenizer(str, " ");
	StringBuffer sb = new StringBuffer();
	while(st.hasMoreElements()){
	sb.append(st.nextElement()).append(" ");
	}
	trim(str);
	System.out.println(sb.toString().trim());
	
	}

	private static void trim(String str) {
		// TODO Auto-generated method stub
		
	}
	}

