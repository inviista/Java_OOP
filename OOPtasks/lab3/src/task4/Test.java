package task4;

import java.util.Collections;
import java.util.Date;
import java.util.Vector;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
	    Person p = new Person("Aldiyar");
	    System.out.println(p);
	    
	    Employee e1 = new Employee("Aldiyar", 100000.0, new Date(), "12345");
	    Employee e2 = new Employee("Camavinga", 10000000.0, new Date(), "678910");
	    System.out.println(e1);
	    System.out.println(e2);
	    
	    Vector<Employee> team = new Vector<>();
        team.add(e1);
        team.add(e2);
        
        Manager m1 = new Manager("Rodrygo", 1200000.0, new Date(), "77777", team, 16000.0);
        Manager m2 = new Manager("Kroos", 1200000.0, new Date(), "01010", team, 12000.0);
        System.out.println(m1);
        System.out.println(m2);
	    
        System.out.println("e1 = e2 " + e1.equals(e2));
        System.out.println("m1 = m2 " + m1.equals(m2));
        
        if(e1.compareTo(e2) == 1) {
            System.out.println("Employee1 > Employee2");
          } else if(e1.compareTo(e2) == -1) {
            System.out.println("Employee1 < Employee2");
          } else {
            System.out.println("Employee1 = Employee2");
          }
          
          if(m1.compareTo(m2) == 1) {
            System.out.println("Manager1 > Manager2");
          } else if(m1.compareTo(m2) == -1) {
            System.out.println("Manager1 < Manager2");
          } else {
            System.out.println("Manager1 = Manager2");
          }
	
        Collections.sort(team, new NameComparator());
        System.out.println(team);
          
        Collections.sort(team, new HireDateComparator());
        System.out.println(team);
	
        System.out.println("Object: " + e2);
        Employee c1 = (Employee)e2.clone();
        c1.fullName = "Ronaldo";
        System.out.println("Clone: " + c1);
        
        System.out.println("Object: " + m2);
        Manager c2 = (Manager)m2.clone();
        c2.fullName = "Messi";
        System.out.println("Clone: " + c2);
	}
}
