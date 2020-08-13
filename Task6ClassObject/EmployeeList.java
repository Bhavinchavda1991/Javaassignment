package Task6ClassObject;

public class EmployeeList {
	

	     public static void main(String []args){
	        System.out.println("Employee List");
	        
	        class Employee {
	         private String name, address;
	         private int year, salary;
	         
	         public Employee(String n, int y, int sal, String add){
	          name = n;
	          year = y;
	          salary = sal;
	          address = add;
	         }
	         
	         public String getN(){
	          return name;
	         }
	         
	         public int getY(){
	          return year;
	         }
	         
	         public int getSalar(){
	          return salary;
	         }
	         
	         public String getAddrs(){
	          return address;
	         }
	         
	        }// End of class employee
	        
	        Employee employee1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
	        Employee employee2 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
	        Employee employee3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
	        
	        System.out.println("Name\tYear of joining\tSalary\tAddress");
	        System.out.println(employee1.getN()+"\t"+employee1.getY()+"\t\t"+employee1.getSalar()+"\t"+employee1.getAddrs()); 
	        System.out.println(employee2.getN()+"\t"+employee2.getY()+"\t\t"+employee2.getSalar()+"\t"+employee2.getAddrs());
	        System.out.println(employee3.getN()+"\t"+employee3.getY()+"\t\t"+employee3.getSalar()+"\t"+employee3.getAddrs());
	                        
	     } //End of main
	}

