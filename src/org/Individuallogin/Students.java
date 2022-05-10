package org.Individuallogin;

public class Students {

	private void StudentsDetails() {
		
		byte age = 23;
				System.out.println("byte age: "+age);
		short salary = 30000;
		        System.out.println("Short salary: "+salary);
		int acNo = 987654321;
		System.out.println("int acNo: "+acNo);
		long phone = 770826044756l;
		System.out.println("long phone; "+phone);
		
		float percentage = 77.89f;
		System.out.println("float percentage: "+percentage);
		double d = 89.4554543;
		System.out.println("double d: "+d);
		
		boolean a = true;
		System.out.println("boolean a: "+a);
		boolean b = false;
		System.out.println("boolean b: "+b);
		
		String s = "Greens Technology";
				System.out.println("String s: "+s);	
	}
	public static void main(String[] args) {
		Students stu = new Students();
		stu.StudentsDetails();
		
				
	}
	
	

}
