package Task6ClassObject;


	class Rectangle{
		private int length;
		private int width;
		Rectangle(){
		    this.length=0;
		      this.width=0;
		}
		Rectangle(int value){
		this.length=value;
		this.width=value;
		}
		 Rectangle(int length, int width){
			this.length=length;
			this.width=width;
			}
			int area(){
			return length*width;
		       }
		   }
			public class RectangleTestData{
		public static void main(String args[]){
			Rectangle r1= new Rectangle();
			Rectangle r2= new Rectangle(4);
			Rectangle r3= new Rectangle(3,4);
				System.out.println("Area of r1: "+ r1.area());
				System.out.println("Area of r1: "+ r2.area());
				System.out.println("Area of r1: "+ r3.area());
			}
		}

