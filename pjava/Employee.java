package pjava;
public class Employee {
		private int empId;
		private double salary;
		private String address;
		public Employee() {}
		public Employee(int empId, double salary, String address) {
			super();
			this.empId = empId;
			this.salary = salary;
			this.address = address;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", salary=" + salary + ", address=" + address + "]";
		}
		
}
