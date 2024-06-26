package task4;

import java.util.Objects;

public class Person {
	String fullName;
	  
	public Person() {	    
	}
	  
	public Person(String fullName) {
		this.fullName = fullName;
	}
	  
	public String toString() {
		return "Person [fullname = " + fullName + "]";
	}
	  
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Person p = (Person) o;
		return Objects.equals(fullName, p.fullName);
	}
	  
	public int hashCode() {
		return Objects.hash(fullName);
	}
}
