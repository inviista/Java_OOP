package task4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee{
	Vector<Employee> team;
	double bonus;
  
	public Manager() {
    
	}
  
	public Manager(String fullName, double salary, Date hireDate, String insuranceNumber, Vector<Employee> team, double bonus) {
		super(fullName, salary, hireDate, insuranceNumber);
	    this.team = team;
	    this.bonus = bonus;
	}
  
	public String toString() {
		return "Manager [fullname = " + fullName + ", salary = " + salary + ", hire date = " + hireDate + ", insurance number = " + insuranceNumber + ", bonus = " + bonus + "]";
	}
  
	public boolean equals(Object o) {
		if(this == o) return true;
	    if(o == null || getClass() != o.getClass()) return false;
	    if(!super.equals(o)) return false;
	    Manager m = (Manager) o;
	    return Objects.equals(team, m.team) && Objects.equals(bonus, m.bonus);
	}
  
	public int hashCode() {
		return Objects.hash(super.hashCode(), team, bonus);
	}
	  
	public int compareTo(Manager o) {
		if(super.salary > o.salary) return 1;
	    if(super.salary < o.salary) return -1;
	    if(super.salary == o.salary) {
	    	if(this.bonus > o.bonus) return 1;
	    	if(this.bonus < o.bonus) return -1;
	    }
	    	return 0;
	}
	
	
	
	
	
	public Object clone() throws CloneNotSupportedException {
		Manager m = (Manager)super.clone();
		return m;
	}
}
