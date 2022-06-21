package org.overloading;

public class OverLoading1{
	
	private void employeeDetails(String name) {
		System.out.println("Employee Details");
		
	}
	private void employeeDetails(String name,int age) {
		System.out.println("EmployeeName :"+name+"\n"+"Employee Age : " +age);
	}
	private void employeeDetails(long pin,short yearofjoining){
		System.out.println("Employee pin ID  : "+pin+"/n"+"Year Of Joining  :"+yearofjoining);

	}
	public static void main(String[] args) {
		OverLoading1 o =new OverLoading1();
		o.employeeDetails("Employee Details");
		o.employeeDetails("Santhosh", 26);;
		o.employeeDetails(123456789l, 2022);
		
	}
	 
}
