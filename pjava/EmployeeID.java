package pjava;

public class EmployeeID {
	private int emp_id;
	private String emp_name;

	public int getEmp_id() {
		return emp_id;
		    }

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	@Override
	public String toString() {
		return "EmployeeID [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}

	
} 
	