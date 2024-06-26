package interfaces2;

import java.util.Collections;
import java.util.Vector;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s = new Student(20, 2, "Misha");
		Student s2 = new Student(25, 2, "Alisher");
		Student s3 = new Student(18, 2, "Chingiz");

		Vector<Student> students = new Vector<Student>();
		students.add(s);
		students.add(s2);
		students.add(s3);

		System.out.println("BEFORE "+ students);
		Collections.sort(students, new NameComparator());
		//Collections.sort(students); //default sort
		System.out.println("AFTER "+ students +"\n");


		// cloning
		Student copy = s; // just reference
		copy.age = 80;
		//age changes for both original object and copy
		System.out.println("OBJECT:"+s);
		System.out.println("COPY:"+s+"\n");

		Student clone = (Student)s.clone(); // clone
		clone.age = 99;
		//age changes for clone only, because they are independent
		//reference types, e.g., date also will not be changed, because we did 
		//deep clone
		System.out.println("OBJECT:"+s);
		System.out.println("CLONE:"+clone);
	}

}
