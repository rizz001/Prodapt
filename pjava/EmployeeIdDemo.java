package pjava;

public class EmployeeIdDemo {

	public static void main(String[] args) {
        EmployeeID emp = new EmployeeID();
        EmployeeID emp1 = new EmployeeID();
       
        Object a[]=new Object[2];
        
        a[0]=emp;
        a[1]=emp1;
       
        
        emp.setEmp_id(10);
        emp.setEmp_name("Matt");
       
        
        emp.setEmp_id(11);
        emp.setEmp_name("Jack");
       
        
        emp.setEmp_id(12);
        emp.setEmp_name("Matt");
        
        emp.setEmp_id(13);
        emp.setEmp_name("Hari");
        
        emp.setEmp_id(14);
        emp.setEmp_name("Akash");
       
       emp1.setEmp_id(140);
       emp1.setEmp_name("Matt");

       
       emp1.setEmp_id(131);
       emp1.setEmp_name("Jack");
     
       
       emp1.setEmp_id(112);
       emp1.setEmp_name("Matt");
       
       emp1.setEmp_id(193);
       emp1.setEmp_name("Hari");
       
       emp1.setEmp_id(514);
       emp1.setEmp_name("Akash");
       
       System.out.println(a);
       
      run(a);
      
	}
	public static void run(Object a[]) {
		
		for(Object k:a) {
			System.out.println(k);
		}
		
	}
}
