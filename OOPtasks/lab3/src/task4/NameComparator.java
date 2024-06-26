package task4;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
	  public int compare(Employee o1, Employee o2) {
	    return o1.fullName.compareTo(o2.fullName);
	  }
	  
}