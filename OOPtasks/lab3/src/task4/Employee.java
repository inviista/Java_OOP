package task4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Cloneable, Comparable<Employee>{
	double salary;
	Date hireDate;
	String insuranceNumber;
	
	public Employee() {
		
	}
	
	public Employee(String fullName, double salary, Date hireDate, String insuranceNumber) {
		super(fullName);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		if(!super.equals(o)) return false;
		Employee e = (Employee) o;
		return Objects.equals(salary, e.salary) &&
				Objects.equals(hireDate, e.hireDate) && 
				Objects.equals(insuranceNumber, e.insuranceNumber);
	}
		  
	public int hashCode() {
		return Objects.hash(super.hashCode(), salary, hireDate, insuranceNumber);
	}
	
	public int compareTo(Employee o) {
		if(this.salary > o.salary) return 1;
		if(this.salary < o.salary) return -1;
		return 0;
	}
	

	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee)super.clone();
		return e;
	}

}
