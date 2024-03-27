package pjava;

public class EmployeeDemo {
	
	public static void main (String[] args) {
		Employee employee = new Employee();
		System.out.println(employee);
		employee.setEmpId(1);
		employee.setSalary(15000.00);
		employee.setAddress("Chennai");
		
		System.out.println(employee);
		System.out.println(employee.getAddress());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getSalary());
		
		System.out.println("***************************************");
		
		Employee employee1=new Employee(2,7000.00,"Delhi");
		   System.out.println(employee1);
		   System.out.println(employee1.getSalary());
		   double increaseSalary=employee1.getSalary()*2;
		
		   employee1.setSalary(increaseSalary);
		   System.out.println(employee1);
		   System.out.println( increaseSalary);
		
	
	}
}
