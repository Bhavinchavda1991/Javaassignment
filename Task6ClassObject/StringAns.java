package Task6ClassObject;


	class Programming{
		  public Programming(String s){
		    System.out.println("java "+s);
		  }
		  public Programming(){
		    System.out.println("I love java");
		  }
		}

		class StringAns{
		  public static void main(String[] args){
		    Programming s = new Programming("Java");
		    Programming a = new Programming();
		  }
		}

