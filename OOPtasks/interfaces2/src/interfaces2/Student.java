package interfaces2;

import java.util.Date;

public class Student implements Cloneable, Comparable<Student>{
	int age;
	int id;
	String name;
	Date enrolled;
	public Student() {

	}
	public Student(int age, int id) {
		super();
		this.age = age;
		this.id = id;
		this.enrolled = new Date();
	}
	public Student(int age, int id, String name) {
		this(age, id);
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	public Object clone() throws CloneNotSupportedException {
		Student s = (Student)super.clone();
		s.enrolled = (Date)enrolled.clone();
		return s;

	}
	@Override
	public int compareTo(Student o) {
		if(this.age > o.age) return 1;
		if(this.age <o.age) return -1;
		return 0;
	}
}

